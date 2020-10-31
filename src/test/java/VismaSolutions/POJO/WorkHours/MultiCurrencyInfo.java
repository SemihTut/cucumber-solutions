package VismaSolutions.POJO.WorkHours;

public class MultiCurrencyInfo {
    private String amount;

    private String purpose;

    private String currencyCode;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getPurpose ()
    {
        return purpose;
    }

    public void setPurpose (String purpose)
    {
        this.purpose = purpose;
    }

    public String getCurrencyCode ()
    {
        return currencyCode;
    }

    public void setCurrencyCode (String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", purpose = "+purpose+", currencyCode = "+currencyCode+"]";
    }
}
