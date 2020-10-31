package VismaSolutions.POJO.Invoices;

public class BusinessUnit{
	private Object code;
	private String companyName;
	private String name;
	private String companyCountryGuid;
	private String guid;
	private String companyGuid;
	private Object companyBusinessUnitGuid;
	private String companyCurrencyGuid;

	public void setCode(Object code){
		this.code = code;
	}

	public Object getCode(){
		return code;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCompanyCountryGuid(String companyCountryGuid){
		this.companyCountryGuid = companyCountryGuid;
	}

	public String getCompanyCountryGuid(){
		return companyCountryGuid;
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

	public void setCompanyBusinessUnitGuid(Object companyBusinessUnitGuid){
		this.companyBusinessUnitGuid = companyBusinessUnitGuid;
	}

	public Object getCompanyBusinessUnitGuid(){
		return companyBusinessUnitGuid;
	}

	public void setCompanyCurrencyGuid(String companyCurrencyGuid){
		this.companyCurrencyGuid = companyCurrencyGuid;
	}

	public String getCompanyCurrencyGuid(){
		return companyCurrencyGuid;
	}

	@Override
 	public String toString(){
		return 
			"BusinessUnit{" + 
			"code = '" + code + '\'' + 
			",companyName = '" + companyName + '\'' + 
			",name = '" + name + '\'' + 
			",companyCountryGuid = '" + companyCountryGuid + '\'' + 
			",guid = '" + guid + '\'' + 
			",companyGuid = '" + companyGuid + '\'' + 
			",companyBusinessUnitGuid = '" + companyBusinessUnitGuid + '\'' + 
			",companyCurrencyGuid = '" + companyCurrencyGuid + '\'' + 
			"}";
		}
}
