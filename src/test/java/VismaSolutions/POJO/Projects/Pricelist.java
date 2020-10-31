package VismaSolutions.POJO.Projects;

public class Pricelist{
	private String name;
	private boolean isCustom;
	private String guid;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsCustom(boolean isCustom){
		this.isCustom = isCustom;
	}

	public boolean isIsCustom(){
		return isCustom;
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
			"Pricelist{" + 
			"name = '" + name + '\'' + 
			",isCustom = '" + isCustom + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
