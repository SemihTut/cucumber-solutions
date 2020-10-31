package VismaSolutions.POJO.ProjectTravelExpenses;

public class LastUpdatedBy{
	private String firstName;
	private String lastName;
	private String code;
	private String name;
	private String guid;
	private String photoFileGuid;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
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

	public void setPhotoFileGuid(String photoFileGuid){
		this.photoFileGuid = photoFileGuid;
	}

	public String getPhotoFileGuid(){
		return photoFileGuid;
	}

	@Override
 	public String toString(){
		return 
			"LastUpdatedBy{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",photoFileGuid = '" + photoFileGuid + '\'' + 
			"}";
		}
}
