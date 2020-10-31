package VismaSolutions.POJO.ProjectTravelExpenses;

public class TravelExpense{
	private boolean includeTime;
	private String expenseClass;
	private String name;
	private String guid;

	public TravelExpense(String guid) {
		this.guid = guid;
	}

	public void setIncludeTime(boolean includeTime){
		this.includeTime = includeTime;
	}

	public boolean isIncludeTime(){
		return includeTime;
	}

	public void setExpenseClass(String expenseClass){
		this.expenseClass = expenseClass;
	}

	public String getExpenseClass(){
		return expenseClass;
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
			"TravelExpense{" + 
			"includeTime = '" + includeTime + '\'' + 
			",expenseClass = '" + expenseClass + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
