package VismaSolutions.POJO.Invoices;

public class ProjectsItem{
	private int number;
	private String name;
	private String guid;

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

	@Override
 	public String toString(){
		return 
			"ProjectsItem{" + 
			"number = '" + number + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
