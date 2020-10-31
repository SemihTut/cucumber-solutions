package VismaSolutions.POJO.TestCustomer_Semih;

public class Language{
	private String englishName;
	private String code;
	private String name;
	private String guid;

	public void setEnglishName(String englishName){
		this.englishName = englishName;
	}

	public String getEnglishName(){
		return englishName;
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
			"Language{" + 
			"englishName = '" + englishName + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
