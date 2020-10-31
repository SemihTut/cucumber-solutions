package VismaSolutions.POJO.ProjectTravelExpenses;

import java.util.List;

public class UnitPrice{
	private int amount;
	private List<MultiCurrencyInfoItem> multiCurrencyInfo;
	private String currencyCode;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setMultiCurrencyInfo(List<MultiCurrencyInfoItem> multiCurrencyInfo){
		this.multiCurrencyInfo = multiCurrencyInfo;
	}

	public List<MultiCurrencyInfoItem> getMultiCurrencyInfo(){
		return multiCurrencyInfo;
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
			"UnitPrice{" + 
			"amount = '" + amount + '\'' + 
			",multiCurrencyInfo = '" + multiCurrencyInfo + '\'' + 
			",currencyCode = '" + currencyCode + '\'' + 
			"}";
		}
}