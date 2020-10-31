package VismaSolutions.POJO.ProjectFees;

public class PriceCurrency{
	private String symbol;
	private String code;
	private String name;
	private String guid;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
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
			"PriceCurrency{" + 
			"symbol = '" + symbol + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
