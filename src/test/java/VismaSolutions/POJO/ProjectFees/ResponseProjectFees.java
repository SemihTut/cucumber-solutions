package VismaSolutions.POJO.ProjectFees;

public class ResponseProjectFees{
	private double unitCostInBaseCurrency;
	private String invoiceRowGuid;
	private int projectRelationToUser;
	private String invoiceDescription;
	private Project project;
	private String description;
	private String createdDateTime;
	private double unitCostInProjectCompanyCurrency;
	private Object recurrenceRuleGuid;
	private boolean hasVolumePricing;
	private String productType;
	private Phase phase;
	private double unitPrice;
	private LastUpdatedBy lastUpdatedBy;
	private Product product;
	private double valueAddedTax;
	private Object salesAccount;
	private double quantity;
	private double unitPriceInProjectCompanyCurrency;
	private String billingSchedule;
	private Object costCenter;
	private boolean isRecurrenceRule;
	private Object billingDependencyPhase;
	private Object invoiceComment;
	private String plannedBillingDate;
	private String measurementUnit;
	private boolean isBillable;
	private PriceCurrency priceCurrency;
	private double invoiceQuantity;
	private CreatedBy createdBy;
	private double unitCost;
	private String name;
	private String guid;
	private Invoice invoice;
	private String lastUpdatedDateTime;
	private CostCurrency costCurrency;
	private double unitPriceInBaseCurrency;
	private Object user;
	private Object displayPeriodStartDate;
	private String eventDate;
	private Customer customer;

	public ResponseProjectFees(Phase phase, double quantity, Product product, Project project) {
		this.phase = phase;
		this.quantity = quantity;
		this.product = product;
		this.project = project;
	}

	public void setUnitCostInBaseCurrency(double unitCostInBaseCurrency){
		this.unitCostInBaseCurrency = unitCostInBaseCurrency;
	}

	public double getUnitCostInBaseCurrency(){
		return unitCostInBaseCurrency;
	}

	public void setInvoiceRowGuid(String invoiceRowGuid){
		this.invoiceRowGuid = invoiceRowGuid;
	}

	public String getInvoiceRowGuid(){
		return invoiceRowGuid;
	}

	public void setProjectRelationToUser(int projectRelationToUser){
		this.projectRelationToUser = projectRelationToUser;
	}

	public int getProjectRelationToUser(){
		return projectRelationToUser;
	}

	public void setInvoiceDescription(String invoiceDescription){
		this.invoiceDescription = invoiceDescription;
	}

	public String getInvoiceDescription(){
		return invoiceDescription;
	}

	public void setProject(Project project){
		this.project = project;
	}

	public Project getProject(){
		return project;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedDateTime(String createdDateTime){
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime(){
		return createdDateTime;
	}

	public void setUnitCostInProjectCompanyCurrency(double unitCostInProjectCompanyCurrency){
		this.unitCostInProjectCompanyCurrency = unitCostInProjectCompanyCurrency;
	}

	public double getUnitCostInProjectCompanyCurrency(){
		return unitCostInProjectCompanyCurrency;
	}

	public void setRecurrenceRuleGuid(Object recurrenceRuleGuid){
		this.recurrenceRuleGuid = recurrenceRuleGuid;
	}

	public Object getRecurrenceRuleGuid(){
		return recurrenceRuleGuid;
	}

	public void setHasVolumePricing(boolean hasVolumePricing){
		this.hasVolumePricing = hasVolumePricing;
	}

	public boolean isHasVolumePricing(){
		return hasVolumePricing;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	public void setPhase(Phase phase){
		this.phase = phase;
	}

	public Phase getPhase(){
		return phase;
	}

	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public void setLastUpdatedBy(LastUpdatedBy lastUpdatedBy){
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LastUpdatedBy getLastUpdatedBy(){
		return lastUpdatedBy;
	}

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setValueAddedTax(double valueAddedTax){
		this.valueAddedTax = valueAddedTax;
	}

	public double getValueAddedTax(){
		return valueAddedTax;
	}

	public void setSalesAccount(Object salesAccount){
		this.salesAccount = salesAccount;
	}

	public Object getSalesAccount(){
		return salesAccount;
	}

	public void setQuantity(double quantity){
		this.quantity = quantity;
	}

	public double getQuantity(){
		return quantity;
	}

	public void setUnitPriceInProjectCompanyCurrency(double unitPriceInProjectCompanyCurrency){
		this.unitPriceInProjectCompanyCurrency = unitPriceInProjectCompanyCurrency;
	}

	public double getUnitPriceInProjectCompanyCurrency(){
		return unitPriceInProjectCompanyCurrency;
	}

	public void setBillingSchedule(String billingSchedule){
		this.billingSchedule = billingSchedule;
	}

	public String getBillingSchedule(){
		return billingSchedule;
	}

	public void setCostCenter(Object costCenter){
		this.costCenter = costCenter;
	}

	public Object getCostCenter(){
		return costCenter;
	}

	public void setIsRecurrenceRule(boolean isRecurrenceRule){
		this.isRecurrenceRule = isRecurrenceRule;
	}

	public boolean isIsRecurrenceRule(){
		return isRecurrenceRule;
	}

	public void setBillingDependencyPhase(Object billingDependencyPhase){
		this.billingDependencyPhase = billingDependencyPhase;
	}

	public Object getBillingDependencyPhase(){
		return billingDependencyPhase;
	}

	public void setInvoiceComment(Object invoiceComment){
		this.invoiceComment = invoiceComment;
	}

	public Object getInvoiceComment(){
		return invoiceComment;
	}

	public void setPlannedBillingDate(String plannedBillingDate){
		this.plannedBillingDate = plannedBillingDate;
	}

	public String getPlannedBillingDate(){
		return plannedBillingDate;
	}

	public void setMeasurementUnit(String measurementUnit){
		this.measurementUnit = measurementUnit;
	}

	public String getMeasurementUnit(){
		return measurementUnit;
	}

	public void setIsBillable(boolean isBillable){
		this.isBillable = isBillable;
	}

	public boolean isIsBillable(){
		return isBillable;
	}

	public void setPriceCurrency(PriceCurrency priceCurrency){
		this.priceCurrency = priceCurrency;
	}

	public PriceCurrency getPriceCurrency(){
		return priceCurrency;
	}

	public void setInvoiceQuantity(double invoiceQuantity){
		this.invoiceQuantity = invoiceQuantity;
	}

	public double getInvoiceQuantity(){
		return invoiceQuantity;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setUnitCost(double unitCost){
		this.unitCost = unitCost;
	}

	public double getUnitCost(){
		return unitCost;
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

	public void setInvoice(Invoice invoice){
		this.invoice = invoice;
	}

	public Invoice getInvoice(){
		return invoice;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime){
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime(){
		return lastUpdatedDateTime;
	}

	public void setCostCurrency(CostCurrency costCurrency){
		this.costCurrency = costCurrency;
	}

	public CostCurrency getCostCurrency(){
		return costCurrency;
	}

	public void setUnitPriceInBaseCurrency(double unitPriceInBaseCurrency){
		this.unitPriceInBaseCurrency = unitPriceInBaseCurrency;
	}

	public double getUnitPriceInBaseCurrency(){
		return unitPriceInBaseCurrency;
	}

	public void setUser(Object user){
		this.user = user;
	}

	public Object getUser(){
		return user;
	}

	public void setDisplayPeriodStartDate(Object displayPeriodStartDate){
		this.displayPeriodStartDate = displayPeriodStartDate;
	}

	public Object getDisplayPeriodStartDate(){
		return displayPeriodStartDate;
	}

	public void setEventDate(String eventDate){
		this.eventDate = eventDate;
	}

	public String getEventDate(){
		return eventDate;
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
			"ResponseProjectFees{" + 
			"unitCostInBaseCurrency = '" + unitCostInBaseCurrency + '\'' + 
			",invoiceRowGuid = '" + invoiceRowGuid + '\'' + 
			",projectRelationToUser = '" + projectRelationToUser + '\'' + 
			",invoiceDescription = '" + invoiceDescription + '\'' + 
			",project = '" + project + '\'' + 
			",description = '" + description + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",unitCostInProjectCompanyCurrency = '" + unitCostInProjectCompanyCurrency + '\'' + 
			",recurrenceRuleGuid = '" + recurrenceRuleGuid + '\'' + 
			",hasVolumePricing = '" + hasVolumePricing + '\'' + 
			",productType = '" + productType + '\'' + 
			",phase = '" + phase + '\'' + 
			",unitPrice = '" + unitPrice + '\'' + 
			",lastUpdatedBy = '" + lastUpdatedBy + '\'' + 
			",product = '" + product + '\'' + 
			",valueAddedTax = '" + valueAddedTax + '\'' + 
			",salesAccount = '" + salesAccount + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",unitPriceInProjectCompanyCurrency = '" + unitPriceInProjectCompanyCurrency + '\'' + 
			",billingSchedule = '" + billingSchedule + '\'' + 
			",costCenter = '" + costCenter + '\'' + 
			",isRecurrenceRule = '" + isRecurrenceRule + '\'' + 
			",billingDependencyPhase = '" + billingDependencyPhase + '\'' + 
			",invoiceComment = '" + invoiceComment + '\'' + 
			",plannedBillingDate = '" + plannedBillingDate + '\'' + 
			",measurementUnit = '" + measurementUnit + '\'' + 
			",isBillable = '" + isBillable + '\'' + 
			",priceCurrency = '" + priceCurrency + '\'' + 
			",invoiceQuantity = '" + invoiceQuantity + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",unitCost = '" + unitCost + '\'' + 
			",name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			",invoice = '" + invoice + '\'' + 
			",lastUpdatedDateTime = '" + lastUpdatedDateTime + '\'' + 
			",costCurrency = '" + costCurrency + '\'' + 
			",unitPriceInBaseCurrency = '" + unitPriceInBaseCurrency + '\'' + 
			",user = '" + user + '\'' + 
			",displayPeriodStartDate = '" + displayPeriodStartDate + '\'' + 
			",eventDate = '" + eventDate + '\'' + 
			",customer = '" + customer + '\'' + 
			"}";
		}
}
