package VismaSolutions.POJO.Projects;

public class SalesStatus{
	private String salesStatusTypeGuid;
	private String name;
	private String guid;

	public void setSalesStatusTypeGuid(String salesStatusTypeGuid){
		this.salesStatusTypeGuid = salesStatusTypeGuid;
	}

	public String getSalesStatusTypeGuid(){
		return salesStatusTypeGuid;
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
			"SalesStatus{" + 
			"salesStatusTypeGuid = '" + salesStatusTypeGuid + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
