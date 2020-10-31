package VismaSolutions.POJO.Invoices;

public class InvoiceTemplate{
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
			"InvoiceTemplate{" + 
			"name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
