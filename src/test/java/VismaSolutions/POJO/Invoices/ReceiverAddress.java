package VismaSolutions.POJO.Invoices;

public class ReceiverAddress{
	private String country;
	private String city;
	private String postalCode;
	private String addressline;
	private String state;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setAddressline(String addressline){
		this.addressline = addressline;
	}

	public String getAddressline(){
		return addressline;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"ReceiverAddress{" + 
			"country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",addressline = '" + addressline + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}
