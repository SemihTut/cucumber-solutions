package VismaSolutions.POJO.Projects;

public class InvoiceTemplate{
	private Object templateInvoiceGuid;
	private String name;
	private String guid;

	public void setTemplateInvoiceGuid(Object templateInvoiceGuid){
		this.templateInvoiceGuid = templateInvoiceGuid;
	}

	public Object getTemplateInvoiceGuid(){
		return templateInvoiceGuid;
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
			"InvoiceTemplate{" + 
			"templateInvoiceGuid = '" + templateInvoiceGuid + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
