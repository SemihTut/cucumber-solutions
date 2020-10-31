package VismaSolutions.POJO.ProjectTravelExpenses;

public class User{
	private String code;
	private String name;
	private String guid;
	private String companyGuid;
	private String photoFileGuid;

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

	public void setCompanyGuid(String companyGuid){
		this.companyGuid = companyGuid;
	}

	public String getCompanyGuid(){
		return companyGuid;
	}

	public void setPhotoFileGuid(String photoFileGuid){
		this.photoFileGuid = photoFileGuid;
	}

	public String getPhotoFileGuid(){
		return photoFileGuid;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",companyGuid = '" + companyGuid + '\'' + 
			",photoFileGuid = '" + photoFileGuid + '\'' + 
			"}";
		}
}
