package VismaSolutions.POJO.ProjectFees;

public class Project{
	private String name;
	private String guid;
	private String companyGuid;

	public Project(String guid) {
		this.guid = guid;
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

	public void setCompanyGuid(String companyGuid){
		this.companyGuid = companyGuid;
	}

	public String getCompanyGuid(){
		return companyGuid;
	}

	@Override
 	public String toString(){
		return 
			"Project{" + 
			"name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",companyGuid = '" + companyGuid + '\'' + 
			"}";
		}
}
