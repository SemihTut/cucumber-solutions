package VismaSolutions.POJO.ProjectTravelExpenses;

public class Invoice{
	private String date;
	private int number;
	private String guid;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
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
			"Invoice{" + 
			"date = '" + date + '\'' + 
			",number = '" + number + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
