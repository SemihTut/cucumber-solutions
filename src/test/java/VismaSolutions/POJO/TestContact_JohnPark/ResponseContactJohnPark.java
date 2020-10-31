package VismaSolutions.POJO.TestContact_JohnPark;

public class ResponseContactJohnPark{
	private String lastName;
	private Object lastUpdatedBy;
	private Object role;
	private Object jobTitle;
	private Object description;
	private Object timeZone;
	private String createdDateTime;
	private Object dateOfBirth;
	private Language language;
	private boolean isActive;
	private Object phoneNumbers;
	private Object emails;
	private String firstName;
	private boolean isDeleted;
	private CreatedBy createdBy;
	private boolean isEmailAllowed;
	private String satisfactionLevel;
	private String name;
	private String guid;
	private Object salutation;
	private Object lastUpdatedDateTime;
	private Customer customer;
	private Object addressGuid;

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastUpdatedBy(Object lastUpdatedBy){
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Object getLastUpdatedBy(){
		return lastUpdatedBy;
	}

	public void setRole(Object role){
		this.role = role;
	}

	public Object getRole(){
		return role;
	}

	public void setJobTitle(Object jobTitle){
		this.jobTitle = jobTitle;
	}

	public Object getJobTitle(){
		return jobTitle;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setTimeZone(Object timeZone){
		this.timeZone = timeZone;
	}

	public Object getTimeZone(){
		return timeZone;
	}

	public void setCreatedDateTime(String createdDateTime){
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime(){
		return createdDateTime;
	}

	public void setDateOfBirth(Object dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public Object getDateOfBirth(){
		return dateOfBirth;
	}

	public void setLanguage(Language language){
		this.language = language;
	}

	public Language getLanguage(){
		return language;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setPhoneNumbers(Object phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	public Object getPhoneNumbers(){
		return phoneNumbers;
	}

	public void setEmails(Object emails){
		this.emails = emails;
	}

	public Object getEmails(){
		return emails;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setIsDeleted(boolean isDeleted){
		this.isDeleted = isDeleted;
	}

	public boolean isIsDeleted(){
		return isDeleted;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setIsEmailAllowed(boolean isEmailAllowed){
		this.isEmailAllowed = isEmailAllowed;
	}

	public boolean isIsEmailAllowed(){
		return isEmailAllowed;
	}

	public void setSatisfactionLevel(String satisfactionLevel){
		this.satisfactionLevel = satisfactionLevel;
	}

	public String getSatisfactionLevel(){
		return satisfactionLevel;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setSalutation(Object salutation){
		this.salutation = salutation;
	}

	public Object getSalutation(){
		return salutation;
	}

	public void setLastUpdatedDateTime(Object lastUpdatedDateTime){
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public Object getLastUpdatedDateTime(){
		return lastUpdatedDateTime;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	public void setAddressGuid(Object addressGuid){
		this.addressGuid = addressGuid;
	}

	public Object getAddressGuid(){
		return addressGuid;
	}

	@Override
 	public String toString(){
		return 
			"ResponseContactJohnPark{" + 
			"lastName = '" + lastName + '\'' + 
			",lastUpdatedBy = '" + lastUpdatedBy + '\'' + 
			",role = '" + role + '\'' + 
			",jobTitle = '" + jobTitle + '\'' + 
			",description = '" + description + '\'' + 
			",timeZone = '" + timeZone + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",dateOfBirth = '" + dateOfBirth + '\'' + 
			",language = '" + language + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",phoneNumbers = '" + phoneNumbers + '\'' + 
			",emails = '" + emails + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",isEmailAllowed = '" + isEmailAllowed + '\'' + 
			",satisfactionLevel = '" + satisfactionLevel + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",salutation = '" + salutation + '\'' + 
			",lastUpdatedDateTime = '" + lastUpdatedDateTime + '\'' + 
			",customer = '" + customer + '\'' + 
			",addressGuid = '" + addressGuid + '\'' + 
			"}";
		}
}
