package VismaSolutions.POJO.WorkHours;

public class UnitCost {
    private String amount;

    private MultiCurrencyInfo[] multiCurrencyInfo;

    private String currencyCode;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public MultiCurrencyInfo[] getMultiCurrencyInfo ()
    {
        return multiCurrencyInfo;
    }

    public void setMultiCurrencyInfo (MultiCurrencyInfo[] multiCurrencyInfo)
    {
        this.multiCurrencyInfo = multiCurrencyInfo;
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
        return "ClassPojo [amount = "+amount+", multiCurrencyInfo = "+multiCurrencyInfo+", currencyCode = "+currencyCode+"]";
    }
}
