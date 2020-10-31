package VismaSolutions.POJO.Projects;

public class CustomerContact{
	private String firstName;
	private String lastName;
	private boolean isDeleted;
	private String name;
	private String guid;

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

	public void setIsDeleted(boolean isDeleted){
		this.isDeleted = isDeleted;
	}

	public boolean isIsDeleted(){
		return isDeleted;
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

	@Override
 	public String toString(){
		return 
			"CustomerContact{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
