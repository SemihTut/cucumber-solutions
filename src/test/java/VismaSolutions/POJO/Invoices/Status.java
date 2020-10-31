package VismaSolutions.POJO.Invoices;

public class Status{
	private int sortOrder;
	private String name;
	private String guid;
	private String updated;

	public void setSortOrder(int sortOrder){
		this.sortOrder = sortOrder;
	}

	public int getSortOrder(){
		return sortOrder;
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

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",updated = '" + updated + '\'' + 
			"}";
		}
}
