package VismaSolutions.POJO.ProjectTravelExpenses;

public class SalesAccount{
	private String name;
	private String guid;

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
			"SalesAccount{" + 
			"name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
