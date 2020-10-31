package VismaSolutions.StepDefinitions;

import VismaSolutions.POJO.Deneme;
import VismaSolutions.POJO.ProjectFees.Product;
import VismaSolutions.POJO.ProjectFees.Project;
import VismaSolutions.POJO.ProjectFees.ResponseProjectFees;
import VismaSolutions.POJO.ProjectTravelExpenses.ResponseProjectTravelExpenses;
import VismaSolutions.POJO.ProjectTravelExpenses.TravelExpense;
import VismaSolutions.POJO.ProjectTravelExpenses.User;
import VismaSolutions.POJO.TestContact_JohnPark.ResponseContactJohnPark;
import VismaSolutions.POJO.TestCustomer_Semih.ResponseCustomerSemih;
import VismaSolutions.POJO.WorkHours.Phase;
import VismaSolutions.POJO.WorkHours.WorkHours;
import VismaSolutions.POJO.WorkHours.WorkType;
import VismaSolutions.Utilities.ConfigurationReader;
import VismaSolutions.Utilities.VismaApiUtils;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {
    String token;
    Response response;
    String emailGlobal;
    String customerGlobal;
    String guidCustomer;
    String lastGuidGlobal;
    String guidContact;
    String globalSearchItem;
    String globalSearchGuid;

    /*
    To generate token this step is must. So it is a kind of pre-step for
    all test cases. This is the reason I put this step as a "Backround"
    in "user.feature" file
     */
    @Given("I logged Visma Solutions API using {string} and {string}")
    public void i_logged_Visma_Solutions_API_using_and(String email, String password) {
        /*
        Inside Utilities package I have a method called "generateToken"
        That method returns token as a String
         */
        token = VismaApiUtils.generateToken(email,password);
        emailGlobal = email;

    }

    @When("I get the current user information from api")
    public void i_get_the_current_user_information_from_api() {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/users";

        //without using request spesification
        /*response = given().contentType(ContentType.JSON)
                .queryParam("active","true")
                .header("Authorization",token)
                .header("Referer","https://severa.stag.visma.com/PSARest")
                .when().get(url);*/

       response = given().spec(VismaApiUtils.requestReady())
                .queryParam("active", "true")
                .when().get(url);

    }

    @Then("status code should be {int}")
    public void status_code_should_be(int int1) {
        //response.then().log().all();
        //Verify that status code equals with the parameter that user inputs inside the feature file
        response.then().spec(VismaApiUtils.responseReady(int1));
       // Assert.assertEquals(int1,response.statusCode());
    }

    @When("I created a new customer {string} from API")
    public void iCreatedANewCustomerFromAPI(String customer) {
        customerGlobal=customer;
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/customers";
        //store the data in a map and send it as a body
        Map<String,String>bodyInput = new HashMap<>();
        bodyInput.put("name",customer);

       response= given()
               .spec(VismaApiUtils.requestReady())
               .body(bodyInput)
        .when().post(url);

       //I store the JSON Response as a POJO(Plain old Java object) classes
        // You can also use jsonpath/path etc
       ResponseCustomerSemih customerSemih = response.as(ResponseCustomerSemih.class);
        guidCustomer = customerSemih.getGuid();
    }

    @When("I created a new contact person {string} from API")
    public void iCreatedANewContactPersonFromAPI(String contactPerson) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/contactpersons";

        HashMap<String,Object>cust= new HashMap<>();
        cust.put("guid",guidCustomer);

        HashMap<String,Object>body= new HashMap<>();
        body.put("firstName",contactPerson);
        body.put("lastName", contactPerson);
        body.put("customer",cust);

        response= given().spec(VismaApiUtils.requestReady())
                .body(body)
                .when().post(url);
        response.then().log().all();
        //Like the customer response, here is the same using POJO classes
        ResponseContactJohnPark contactJohnPark = response.as(ResponseContactJohnPark.class);
        guidContact = contactJohnPark.getGuid();

    }

    @And("I created a new project {string}")
    public void iCreatedANewProject(String projectName) {
        //Date and Calender classes to format and find the dates
        Date dateOfOrder= new Date();
        int noOfDays = 7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfOrder);
        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = calendar.getTime();
        DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        LocalDateTime datetime = LocalDateTime.parse(date.toString(),oldPattern);
        String output = datetime.format(newPattern);
       // System.out.println("output = " + output);

        String url = ConfigurationReader.get("restAPIUrl")+"v0.2/projects";
        HashMap<String,Object>body= new HashMap<>();
        HashMap<String,Object>cust= new HashMap<>();
        body.put("project",projectName);
        cust.put("guid",guidCustomer);
        body.put("name",projectName);
        body.put("expectedValue", 10000);
        body.put("customer",cust);

        body.put("expectedOrderDate",output);

        response= given().spec(VismaApiUtils.requestReady())
                .body(body)
                .when().post(url);
                response.then().log().all();

    }

    @When("I called for all projects")
    public void iCalledForAllProjects() {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/projects";
        response= given().spec(VismaApiUtils.requestReady())
                .when().get(url);
        response.then().log().all();
    }

    @When("I called for all {string}")
    public void iCalledForAll(String whatYouWant) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/"+whatYouWant;
        response= given().spec(VismaApiUtils.requestReady())
                .when().get(url);
       response.then().log().all();

        List<String>lists = null;
        try {
            lists = response.jsonPath().get("name");
            lists.forEach(System.out::println);

            for(int i=0;i<lists.size();i++){
                if(response.jsonPath().get("["+i+"].name").equals("Project_Semih")){
                    globalSearchGuid = ""+response.jsonPath().get("["+i+"].guid");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    @Then("delete the last one {string}")
    public void deleteTheLastOne(String youWant) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/"+youWant+"/{guid}";
        response = given().spec(VismaApiUtils.requestReady())
                .pathParam("guid",guidCustomer)
                .when().delete(url);
    }

    @When("I delete the {string}")
    public void iDeleteThe(String deleteOne) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/"+deleteOne+"/{guid}";
        String guid = ConfigurationReader.get("phasesP2guid");
        response = given().spec(VismaApiUtils.requestReady())
                .pathParam("guid",guid)
                .when().delete(url);
        response.then().log().all();
    }

    @When("I change the {string}")
    public void iChangeThe(String changedOne) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/"+changedOne+"/{guid}";
        String guid = ConfigurationReader.get("customerSTguid");
        System.out.println("guid = " + guid);

        HashMap<String,Object>body= new HashMap<>();
        body.put("[0].name","TestAutomation4");

        response = given().spec(VismaApiUtils.requestReady())
                .pathParam("guid",guid)
                .body(body)
                .when().patch(url);
        response.then().log().all();
    }

    @Then("I created a new phase {string}")
    public void iCreatedANewPhase(String phaseName) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/phases";
        HashMap<String,Object>project=new HashMap<>();
        project.put("guid",ConfigurationReader.get("projectGALATASARAY"));
        HashMap<String,Object>body=new HashMap<>();
        HashMap<String,Object>parent=new HashMap<>();
        parent.put("guid","e891682e-debe-b956-83d2-e189ebac0856");
        body.put("name",phaseName);
        body.put("project",project);
        body.put("parentPhase","");
        body.put("workHoursEstimate",50);
        body.put("parentPhase",parent);

        response = given().spec(VismaApiUtils.requestReady())
                .body(body)
                .when().post(url);
        response.then().log().all();

    }

    @When("I added {int} hours to {string} worktype to {string}")
    public void iAddedHoursToWorktypeTo(int hours, String workType, String phaseName) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/workhours";

        Phase phase =new Phase();
        phase.setGuid(ConfigurationReader.get("phaseTwoGuid"));
        WorkType workType1 = new WorkType();
        workType1.setGuid(globalSearchGuid);
        WorkHours workHours = new WorkHours(phase,
                hours,workType1,"2020-10-30");

        response = given().spec(VismaApiUtils.requestReady())
                .body(workHours)
                .when().post(url);
        response.then().log().all();

    }

    @When("I called for {string} by {string}")
    public void iCalledForWorktypesBy(String search,String name) {
        globalSearchItem = name;
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/"+search;
        response= given().spec(VismaApiUtils.requestReady())
                .when().get(url);
        response.then().log().all();


    }

    @Then("I get the guid")
    public void iGetTheGuid() {
        List<String>lists = response.jsonPath().get("guid");
        System.out.println("globalSearchItem = " + globalSearchItem);
        for(int i=0;i<lists.size();i++){
            if(response.jsonPath().get("["+i+"].name").toString().contains(globalSearchItem)){
                globalSearchGuid = response.jsonPath().get("["+i+"].guid");
            }
        }
        System.out.println("guid = " + globalSearchGuid);

    }

    @And("I added ProjectFee using {string} to {string}")
    public void iAddedProjectFeeUsingTo(String productType, String phaseName) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/projectfees";
        Project project = new Project(ConfigurationReader.get("ProjectSemih"));
        Product product = new Product(globalSearchGuid);
        VismaSolutions.POJO.ProjectFees.Phase phase = new VismaSolutions.POJO.ProjectFees.Phase();
        phase.setGuid(ConfigurationReader.get("phaseTwoGuid"));
        ResponseProjectFees projectFees = new ResponseProjectFees(phase,1.0000,product,project);
        response= given().spec(VismaApiUtils.requestReady())
                .body(projectFees)
                .when().post(url);
        response.then().log().all();


    }

    @And("I added ProjectTravelExpense {int} km to {string}")
    public void iAddedProjectTravelExpenseKmTo(int km, String phaseName) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/projecttravelexpenses";
        //"guid": "1a042f52-8b07-3bdd-5964-d518aaa26506"

        VismaSolutions.POJO.ProjectTravelExpenses.Project project=
                new VismaSolutions.POJO.ProjectTravelExpenses.Project(ConfigurationReader.get("ProjectSemih"));

        TravelExpense travelExpense = new TravelExpense(globalSearchGuid);

        VismaSolutions.POJO.ProjectTravelExpenses.Phase phase =
                new VismaSolutions.POJO.ProjectTravelExpenses.Phase(ConfigurationReader.get("phaseTwoGuid"));

        User user = new User();
        user.setGuid("1a042f52-8b07-3bdd-5964-d518aaa26506");

        ResponseProjectTravelExpenses projectTravelExpenses = new ResponseProjectTravelExpenses(project,phase,
                "2020-10-30T21:52:07.102Z",km,"2020-10-30T23:52:07.102Z",travelExpense,user);

        response= given().spec(VismaApiUtils.requestReady())
                .body(projectTravelExpenses)
                .when().post(url);
        response.then().log().all();
    }

    @And("I added the invoices")
    public void iAddedTheInvoices() {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/invoices";
        Map<String,Object>body = new HashMap<>();
        List<Map<String,Object>>project = new ArrayList<>();
        Map<String,Object>insideMap = new HashMap<>();
        insideMap.put("guid",globalSearchGuid);
        project.add(insideMap);
        body.put("projects", project);

        response= given().spec(VismaApiUtils.requestReady())
                .body(body)
                .when().post(url);
        response.then().log().all();

    }

    @When("I called for invoice row")
    public void iCalledForInvoiceRow() {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/invoiceRows/{invoiceguid}";
        response= given().spec(VismaApiUtils.requestReady())
                .pathParam("invoiceguid",ConfigurationReader.get("invoiceGuid"))
                .when().get(url);
        response.then().log().all();

    }

    @Then("I created a new phase {string} to project {string}")
    public void iCreatedANewPhaseToProject(String phaseName, String projectName) {
        String url = ConfigurationReader.get("restAPIUrl")+"v0.1/phases";
        HashMap<String,Object>project=new HashMap<>();
        project.put("guid",globalSearchGuid);
        HashMap<String,Object>body=new HashMap<>();
        HashMap<String,Object>parent=new HashMap<>();
        parent.put("guid",ConfigurationReader.get("rootPhaseProjectSemih"));
        body.put("name",phaseName);
        body.put("project",project);
        body.put("workHoursEstimate",50);
        body.put("parentPhase",parent);

        response = given().spec(VismaApiUtils.requestReady())
                .body(body)
                .when().post(url);
        response.then().log().all();

    }
}
