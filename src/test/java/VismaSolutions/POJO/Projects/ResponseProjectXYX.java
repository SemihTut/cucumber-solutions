package VismaSolutions.POJO.Projects;

public class ResponseProjectXYX{
	private BusinessUnit businessUnit;
	private Object orderNumber;
	private Object billingContact;
	private String[] keywords;
	private boolean isDailyAllowanceBillable;
	private String createdDateTime;
	private double invoicedTotalInProjectCurrency;
	private double billableTotal;
	private int lateActivityCount;
	private int number;
	private int relationToUser;
	private double expectedValueInCurrentUserCompanyCurrency;
	private LastUpdatedBy lastUpdatedBy;
	private Object completionEstimatePercentage;
	private boolean isJoiningAllowed;
	private Object yourReference;
	private boolean useProductsFromSetting;
	private int probability;
	private Object leadSource;
	private Object costCenter;
	private boolean isInternal;
	private Pricelist pricelist;
	private String name;
	private InvoiceTemplate invoiceTemplate;
	private String guid;
	private ProjectOwner projectOwner;
	private double expectedValueInBaseCurrency;
	private int paymentTerm;
	private String startDate;
	private RootPhase rootPhase;
	private boolean useOvertimeMultipliers;
	private String expectedOrderDate;
	private Object description;
	private double billableTotalInProjectCurrency;
	private String internalName;
	private Object ourReference;
	private int upcomingActivityCount;
	private CustomerContact customerContact;
	private double invoicedTotalInProjectCompanyCurrency;
	private Currency currency;
	private String deadline;
	private boolean isOtherTravelExpensesBillable;
	private DefaultWorkType defaultWorkType;
	private boolean isMileageBillable;
	private double invoicedTotal;
	private boolean useWorktypesFromSetting;
	private boolean isBillable;
	private Object projectStatus;
	private Object invoiceNotes;
	private int calculatedCompletionPercentage;
	private boolean isClosed;
	private String closedDate;
	private CreatedBy createdBy;
	private double expectedValue;
	private int todayActivityCount;
	private SalesStatus salesStatus;
	private SalesPerson salesPerson;
	private String lastUpdatedDateTime;
	private Customer customer;

	public void setBusinessUnit(BusinessUnit businessUnit){
		this.businessUnit = businessUnit;
	}

	public BusinessUnit getBusinessUnit(){
		return businessUnit;
	}

	public void setOrderNumber(Object orderNumber){
		this.orderNumber = orderNumber;
	}

	public Object getOrderNumber(){
		return orderNumber;
	}

	public void setBillingContact(Object billingContact){
		this.billingContact = billingContact;
	}

	public Object getBillingContact(){
		return billingContact;
	}

	public void setKeywords(String [] keywords){
		this.keywords = keywords;
	}

	public Object getKeywords(){
		return keywords;
	}

	public void setIsDailyAllowanceBillable(boolean isDailyAllowanceBillable){
		this.isDailyAllowanceBillable = isDailyAllowanceBillable;
	}

	public boolean isIsDailyAllowanceBillable(){
		return isDailyAllowanceBillable;
	}

	public void setCreatedDateTime(String createdDateTime){
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime(){
		return createdDateTime;
	}

	public void setInvoicedTotalInProjectCurrency(double invoicedTotalInProjectCurrency){
		this.invoicedTotalInProjectCurrency = invoicedTotalInProjectCurrency;
	}

	public double getInvoicedTotalInProjectCurrency(){
		return invoicedTotalInProjectCurrency;
	}

	public void setBillableTotal(double billableTotal){
		this.billableTotal = billableTotal;
	}

	public double getBillableTotal(){
		return billableTotal;
	}

	public void setLateActivityCount(int lateActivityCount){
		this.lateActivityCount = lateActivityCount;
	}

	public int getLateActivityCount(){
		return lateActivityCount;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setRelationToUser(int relationToUser){
		this.relationToUser = relationToUser;
	}

	public int getRelationToUser(){
		return relationToUser;
	}

	public void setExpectedValueInCurrentUserCompanyCurrency(double expectedValueInCurrentUserCompanyCurrency){
		this.expectedValueInCurrentUserCompanyCurrency = expectedValueInCurrentUserCompanyCurrency;
	}

	public double getExpectedValueInCurrentUserCompanyCurrency(){
		return expectedValueInCurrentUserCompanyCurrency;
	}

	public void setLastUpdatedBy(LastUpdatedBy lastUpdatedBy){
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LastUpdatedBy getLastUpdatedBy(){
		return lastUpdatedBy;
	}

	public void setCompletionEstimatePercentage(Object completionEstimatePercentage){
		this.completionEstimatePercentage = completionEstimatePercentage;
	}

	public Object getCompletionEstimatePercentage(){
		return completionEstimatePercentage;
	}

	public void setIsJoiningAllowed(boolean isJoiningAllowed){
		this.isJoiningAllowed = isJoiningAllowed;
	}

	public boolean isIsJoiningAllowed(){
		return isJoiningAllowed;
	}

	public void setYourReference(Object yourReference){
		this.yourReference = yourReference;
	}

	public Object getYourReference(){
		return yourReference;
	}

	public void setUseProductsFromSetting(boolean useProductsFromSetting){
		this.useProductsFromSetting = useProductsFromSetting;
	}

	public boolean isUseProductsFromSetting(){
		return useProductsFromSetting;
	}

	public void setProbability(int probability){
		this.probability = probability;
	}

	public int getProbability(){
		return probability;
	}

	public void setLeadSource(Object leadSource){
		this.leadSource = leadSource;
	}

	public Object getLeadSource(){
		return leadSource;
	}

	public void setCostCenter(Object costCenter){
		this.costCenter = costCenter;
	}

	public Object getCostCenter(){
		return costCenter;
	}

	public void setIsInternal(boolean isInternal){
		this.isInternal = isInternal;
	}

	public boolean isIsInternal(){
		return isInternal;
	}

	public void setPricelist(Pricelist pricelist){
		this.pricelist = pricelist;
	}

	public Pricelist getPricelist(){
		return pricelist;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setInvoiceTemplate(InvoiceTemplate invoiceTemplate){
		this.invoiceTemplate = invoiceTemplate;
	}

	public InvoiceTemplate getInvoiceTemplate(){
		return invoiceTemplate;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setProjectOwner(ProjectOwner projectOwner){
		this.projectOwner = projectOwner;
	}

	public ProjectOwner getProjectOwner(){
		return projectOwner;
	}

	public void setExpectedValueInBaseCurrency(double expectedValueInBaseCurrency){
		this.expectedValueInBaseCurrency = expectedValueInBaseCurrency;
	}

	public double getExpectedValueInBaseCurrency(){
		return expectedValueInBaseCurrency;
	}

	public void setPaymentTerm(int paymentTerm){
		this.paymentTerm = paymentTerm;
	}

	public int getPaymentTerm(){
		return paymentTerm;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setRootPhase(RootPhase rootPhase){
		this.rootPhase = rootPhase;
	}

	public RootPhase getRootPhase(){
		return rootPhase;
	}

	public void setUseOvertimeMultipliers(boolean useOvertimeMultipliers){
		this.useOvertimeMultipliers = useOvertimeMultipliers;
	}

	public boolean isUseOvertimeMultipliers(){
		return useOvertimeMultipliers;
	}

	public void setExpectedOrderDate(String expectedOrderDate){
		this.expectedOrderDate = expectedOrderDate;
	}

	public String getExpectedOrderDate(){
		return expectedOrderDate;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setBillableTotalInProjectCurrency(double billableTotalInProjectCurrency){
		this.billableTotalInProjectCurrency = billableTotalInProjectCurrency;
	}

	public double getBillableTotalInProjectCurrency(){
		return billableTotalInProjectCurrency;
	}

	public void setInternalName(String internalName){
		this.internalName = internalName;
	}

	public String getInternalName(){
		return internalName;
	}

	public void setOurReference(Object ourReference){
		this.ourReference = ourReference;
	}

	public Object getOurReference(){
		return ourReference;
	}

	public void setUpcomingActivityCount(int upcomingActivityCount){
		this.upcomingActivityCount = upcomingActivityCount;
	}

	public int getUpcomingActivityCount(){
		return upcomingActivityCount;
	}

	public void setCustomerContact(CustomerContact customerContact){
		this.customerContact = customerContact;
	}

	public CustomerContact getCustomerContact(){
		return customerContact;
	}

	public void setInvoicedTotalInProjectCompanyCurrency(double invoicedTotalInProjectCompanyCurrency){
		this.invoicedTotalInProjectCompanyCurrency = invoicedTotalInProjectCompanyCurrency;
	}

	public double getInvoicedTotalInProjectCompanyCurrency(){
		return invoicedTotalInProjectCompanyCurrency;
	}

	public void setCurrency(Currency currency){
		this.currency = currency;
	}

	public Currency getCurrency(){
		return currency;
	}

	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	public String getDeadline(){
		return deadline;
	}

	public void setIsOtherTravelExpensesBillable(boolean isOtherTravelExpensesBillable){
		this.isOtherTravelExpensesBillable = isOtherTravelExpensesBillable;
	}

	public boolean isIsOtherTravelExpensesBillable(){
		return isOtherTravelExpensesBillable;
	}

	public void setDefaultWorkType(DefaultWorkType defaultWorkType){
		this.defaultWorkType = defaultWorkType;
	}

	public DefaultWorkType getDefaultWorkType(){
		return defaultWorkType;
	}

	public void setIsMileageBillable(boolean isMileageBillable){
		this.isMileageBillable = isMileageBillable;
	}

	public boolean isIsMileageBillable(){
		return isMileageBillable;
	}

	public void setInvoicedTotal(double invoicedTotal){
		this.invoicedTotal = invoicedTotal;
	}

	public double getInvoicedTotal(){
		return invoicedTotal;
	}

	public void setUseWorktypesFromSetting(boolean useWorktypesFromSetting){
		this.useWorktypesFromSetting = useWorktypesFromSetting;
	}

	public boolean isUseWorktypesFromSetting(){
		return useWorktypesFromSetting;
	}

	public void setIsBillable(boolean isBillable){
		this.isBillable = isBillable;
	}

	public boolean isIsBillable(){
		return isBillable;
	}

	public void setProjectStatus(Object projectStatus){
		this.projectStatus = projectStatus;
	}

	public Object getProjectStatus(){
		return projectStatus;
	}

	public void setInvoiceNotes(Object invoiceNotes){
		this.invoiceNotes = invoiceNotes;
	}

	public Object getInvoiceNotes(){
		return invoiceNotes;
	}

	public void setCalculatedCompletionPercentage(int calculatedCompletionPercentage){
		this.calculatedCompletionPercentage = calculatedCompletionPercentage;
	}

	public int getCalculatedCompletionPercentage(){
		return calculatedCompletionPercentage;
	}

	public void setIsClosed(boolean isClosed){
		this.isClosed = isClosed;
	}

	public boolean isIsClosed(){
		return isClosed;
	}

	public void setClosedDate(String closedDate){
		this.closedDate = closedDate;
	}

	public String getClosedDate(){
		return closedDate;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setExpectedValue(double expectedValue){
		this.expectedValue = expectedValue;
	}

	public double getExpectedValue(){
		return expectedValue;
	}

	public void setTodayActivityCount(int todayActivityCount){
		this.todayActivityCount = todayActivityCount;
	}

	public int getTodayActivityCount(){
		return todayActivityCount;
	}

	public void setSalesStatus(SalesStatus salesStatus){
		this.salesStatus = salesStatus;
	}

	public SalesStatus getSalesStatus(){
		return salesStatus;
	}

	public void setSalesPerson(SalesPerson salesPerson){
		this.salesPerson = salesPerson;
	}

	public SalesPerson getSalesPerson(){
		return salesPerson;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime){
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime(){
		return lastUpdatedDateTime;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	@Override
 	public String toString(){
		return 
			"ResponseProjectXYX{" + 
			"businessUnit = '" + businessUnit + '\'' + 
			",orderNumber = '" + orderNumber + '\'' + 
			",billingContact = '" + billingContact + '\'' + 
			",keywords = '" + keywords + '\'' + 
			",isDailyAllowanceBillable = '" + isDailyAllowanceBillable + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",invoicedTotalInProjectCurrency = '" + invoicedTotalInProjectCurrency + '\'' + 
			",billableTotal = '" + billableTotal + '\'' + 
			",lateActivityCount = '" + lateActivityCount + '\'' + 
			",number = '" + number + '\'' + 
			",relationToUser = '" + relationToUser + '\'' + 
			",expectedValueInCurrentUserCompanyCurrency = '" + expectedValueInCurrentUserCompanyCurrency + '\'' + 
			",lastUpdatedBy = '" + lastUpdatedBy + '\'' + 
			",completionEstimatePercentage = '" + completionEstimatePercentage + '\'' + 
			",isJoiningAllowed = '" + isJoiningAllowed + '\'' + 
			",yourReference = '" + yourReference + '\'' + 
			",useProductsFromSetting = '" + useProductsFromSetting + '\'' + 
			",probability = '" + probability + '\'' + 
			",leadSource = '" + leadSource + '\'' + 
			",costCenter = '" + costCenter + '\'' + 
			",isInternal = '" + isInternal + '\'' + 
			",pricelist = '" + pricelist + '\'' + 
			",name = '" + name + '\'' + 
			",invoiceTemplate = '" + invoiceTemplate + '\'' + 
			",guid = '" + guid + '\'' + 
			",projectOwner = '" + projectOwner + '\'' + 
			",expectedValueInBaseCurrency = '" + expectedValueInBaseCurrency + '\'' + 
			",paymentTerm = '" + paymentTerm + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",rootPhase = '" + rootPhase + '\'' + 
			",useOvertimeMultipliers = '" + useOvertimeMultipliers + '\'' + 
			",expectedOrderDate = '" + expectedOrderDate + '\'' + 
			",description = '" + description + '\'' + 
			",billableTotalInProjectCurrency = '" + billableTotalInProjectCurrency + '\'' + 
			",internalName = '" + internalName + '\'' + 
			",ourReference = '" + ourReference + '\'' + 
			",upcomingActivityCount = '" + upcomingActivityCount + '\'' + 
			",customerContact = '" + customerContact + '\'' + 
			",invoicedTotalInProjectCompanyCurrency = '" + invoicedTotalInProjectCompanyCurrency + '\'' + 
			",currency = '" + currency + '\'' + 
			",deadline = '" + deadline + '\'' + 
			",isOtherTravelExpensesBillable = '" + isOtherTravelExpensesBillable + '\'' + 
			",defaultWorkType = '" + defaultWorkType + '\'' + 
			",isMileageBillable = '" + isMileageBillable + '\'' + 
			",invoicedTotal = '" + invoicedTotal + '\'' + 
			",useWorktypesFromSetting = '" + useWorktypesFromSetting + '\'' + 
			",isBillable = '" + isBillable + '\'' + 
			",projectStatus = '" + projectStatus + '\'' + 
			",invoiceNotes = '" + invoiceNotes + '\'' + 
			",calculatedCompletionPercentage = '" + calculatedCompletionPercentage + '\'' + 
			",isClosed = '" + isClosed + '\'' + 
			",closedDate = '" + closedDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",expectedValue = '" + expectedValue + '\'' + 
			",todayActivityCount = '" + todayActivityCount + '\'' + 
			",salesStatus = '" + salesStatus + '\'' + 
			",salesPerson = '" + salesPerson + '\'' + 
			",lastUpdatedDateTime = '" + lastUpdatedDateTime + '\'' + 
			",customer = '" + customer + '\'' + 
			"}";
		}
}
