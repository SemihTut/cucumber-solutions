package VismaSolutions.POJO.ProjectTravelExpenses;

public class Project{
	private boolean isInternal;
	private int number;
	private String name;
	private String guid;
	private String companyGuid;

	public Project(String guid) {
		this.guid = guid;
	}

	public void setIsInternal(boolean isInternal){
		this.isInternal = isInternal;
	}

	public boolean isIsInternal(){
		return isInternal;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
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
			"isInternal = '" + isInternal + '\'' + 
			",number = '" + number + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",companyGuid = '" + companyGuid + '\'' + 
			"}";
		}
}
