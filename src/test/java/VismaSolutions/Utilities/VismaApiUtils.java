package VismaSolutions.Utilities;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class VismaApiUtils {

    String token ="";
    public static String generateToken(String email,String password){
        Map<String,String>bodyInputs = new HashMap<>();
        bodyInputs.put("login", email);
        bodyInputs.put("password", password);

        Response response = given().body(bodyInputs)
                .contentType(ContentType.JSON)
                .when().post(ConfigurationReader.get("restAPIUrl") + "v0.1/authentication/vismaconnect/signin");

        //get token from api and save token
        String token = response.path("accessToken");
        String finalToken = "Bearer "+token;

        return finalToken;

    }
    public static RequestSpecification requestReady(){

        // for Basic auth
       /* PreemptiveBasicAuthScheme basicAuthScheme = new PreemptiveBasicAuthScheme();
        basicAuthScheme.setPassword(password);
        basicAuthScheme.setUserName(email);
        .header("Authorization",token)
                .header("Referer","https://severa.stag.visma.com/PSARest")

        */
        RequestSpecification build = new RequestSpecBuilder()
                .setContentType("application/json;charset=UTF-8")
                .setAccept(ContentType.JSON)
                .addHeader("Authorization",
                        generateToken(ConfigurationReader.get("automation.tester4@sharklasers.com"),
                                ConfigurationReader.get("password")))
                .addHeader("Referer","https://severa.stag.visma.com/PSARest")
                .build();

        return build;

    }
    public static ResponseSpecification responseReady(int status){

        ResponseSpecification build = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(status)
                .build();

        return build;

    }
}
