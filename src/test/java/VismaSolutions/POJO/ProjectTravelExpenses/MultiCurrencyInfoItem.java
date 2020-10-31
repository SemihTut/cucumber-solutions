package VismaSolutions.POJO.ProjectTravelExpenses;

public class MultiCurrencyInfoItem{
	private int amount;
	private String purpose;
	private String currencyCode;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setPurpose(String purpose){
		this.purpose = purpose;
	}

	public String getPurpose(){
		return purpose;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	@Override
 	public String toString(){
		return 
			"MultiCurrencyInfoItem{" + 
			"amount = '" + amount + '\'' + 
			",purpose = '" + purpose + '\'' + 
			",currencyCode = '" + currencyCode + '\'' + 
			"}";
		}
}
