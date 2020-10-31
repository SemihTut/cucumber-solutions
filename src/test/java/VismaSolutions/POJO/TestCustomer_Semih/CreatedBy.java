package VismaSolutions.POJO.TestCustomer_Semih;

public class CreatedBy{
	private String firstName;
	private String lastName;
	private Object code;
	private String name;
	private String guid;
	private Object photoFileGuid;

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

	public void setCode(Object code){
		this.code = code;
	}

	public Object getCode(){
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

	public void setPhotoFileGuid(Object photoFileGuid){
		this.photoFileGuid = photoFileGuid;
	}

	public Object getPhotoFileGuid(){
		return photoFileGuid;
	}

	@Override
 	public String toString(){
		return 
			"CreatedBy{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",photoFileGuid = '" + photoFileGuid + '\'' + 
			"}";
		}
}
