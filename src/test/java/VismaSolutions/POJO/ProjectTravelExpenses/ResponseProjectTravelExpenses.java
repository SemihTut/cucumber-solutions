package VismaSolutions.POJO.ProjectTravelExpenses;

public class ResponseProjectTravelExpenses{
	private String invoiceRowGuid;
	private int vatRate;
	private Project project;
	private String description;
	private String createdDateTime;
	private String invoiceRowDescription;
	private boolean travelReimbursementRequired;
	private TravelReimbursement travelReimbursement;
	private Phase phase;
	private UnitPrice unitPrice;
	private String travelStartTime;
	private LastUpdatedBy lastUpdatedBy;
	private SalesAccount salesAccount;
	private int quantity;
	private UnitCostExcludingPurchaseVat unitCostExcludingPurchaseVat;
	private String billingSchedule;
	private CostCenter costCenter;
	private String travelEndTime;
	private BillingDependencyPhase billingDependencyPhase;
	private String plannedBillingDate;
	private String measurementUnit;
	private boolean isBillable;
	private int invoiceQuantity;
	private CreatedBy createdBy;
	private TravelExpense travelExpense;
	private UnitCost unitCost;
	private int purchaseVatRate;
	private String guid;
	private int attachmentCount;
	private Invoice invoice;
	private CostAccount costAccount;
	private String lastUpdatedDateTime;
	private String invoiceRowComment;
	private User user;
	private Customer customer;
	private String eventDate;

	public ResponseProjectTravelExpenses(Project project, Phase phase, String travelStartTime,
										 int quantity, String travelEndTime, TravelExpense travelExpense,User user) {
		this.project = project;
		this.phase = phase;
		this.travelStartTime = travelStartTime;
		this.quantity = quantity;
		this.travelEndTime = travelEndTime;
		this.travelExpense = travelExpense;
		this.user=user;
	}

	public void setInvoiceRowGuid(String invoiceRowGuid){
		this.invoiceRowGuid = invoiceRowGuid;
	}

	public String getInvoiceRowGuid(){
		return invoiceRowGuid;
	}

	public void setVatRate(int vatRate){
		this.vatRate = vatRate;
	}

	public int getVatRate(){
		return vatRate;
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

	public void setInvoiceRowDescription(String invoiceRowDescription){
		this.invoiceRowDescription = invoiceRowDescription;
	}

	public String getInvoiceRowDescription(){
		return invoiceRowDescription;
	}

	public void setTravelReimbursementRequired(boolean travelReimbursementRequired){
		this.travelReimbursementRequired = travelReimbursementRequired;
	}

	public boolean isTravelReimbursementRequired(){
		return travelReimbursementRequired;
	}

	public void setTravelReimbursement(TravelReimbursement travelReimbursement){
		this.travelReimbursement = travelReimbursement;
	}

	public TravelReimbursement getTravelReimbursement(){
		return travelReimbursement;
	}

	public void setPhase(Phase phase){
		this.phase = phase;
	}

	public Phase getPhase(){
		return phase;
	}

	public void setUnitPrice(UnitPrice unitPrice){
		this.unitPrice = unitPrice;
	}

	public UnitPrice getUnitPrice(){
		return unitPrice;
	}

	public void setTravelStartTime(String travelStartTime){
		this.travelStartTime = travelStartTime;
	}

	public String getTravelStartTime(){
		return travelStartTime;
	}

	public void setLastUpdatedBy(LastUpdatedBy lastUpdatedBy){
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LastUpdatedBy getLastUpdatedBy(){
		return lastUpdatedBy;
	}

	public void setSalesAccount(SalesAccount salesAccount){
		this.salesAccount = salesAccount;
	}

	public SalesAccount getSalesAccount(){
		return salesAccount;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setUnitCostExcludingPurchaseVat(UnitCostExcludingPurchaseVat unitCostExcludingPurchaseVat){
		this.unitCostExcludingPurchaseVat = unitCostExcludingPurchaseVat;
	}

	public UnitCostExcludingPurchaseVat getUnitCostExcludingPurchaseVat(){
		return unitCostExcludingPurchaseVat;
	}

	public void setBillingSchedule(String billingSchedule){
		this.billingSchedule = billingSchedule;
	}

	public String getBillingSchedule(){
		return billingSchedule;
	}

	public void setCostCenter(CostCenter costCenter){
		this.costCenter = costCenter;
	}

	public CostCenter getCostCenter(){
		return costCenter;
	}

	public void setTravelEndTime(String travelEndTime){
		this.travelEndTime = travelEndTime;
	}

	public String getTravelEndTime(){
		return travelEndTime;
	}

	public void setBillingDependencyPhase(BillingDependencyPhase billingDependencyPhase){
		this.billingDependencyPhase = billingDependencyPhase;
	}

	public BillingDependencyPhase getBillingDependencyPhase(){
		return billingDependencyPhase;
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

	public void setInvoiceQuantity(int invoiceQuantity){
		this.invoiceQuantity = invoiceQuantity;
	}

	public int getInvoiceQuantity(){
		return invoiceQuantity;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setTravelExpense(TravelExpense travelExpense){
		this.travelExpense = travelExpense;
	}

	public TravelExpense getTravelExpense(){
		return travelExpense;
	}

	public void setUnitCost(UnitCost unitCost){
		this.unitCost = unitCost;
	}

	public UnitCost getUnitCost(){
		return unitCost;
	}

	public void setPurchaseVatRate(int purchaseVatRate){
		this.purchaseVatRate = purchaseVatRate;
	}

	public int getPurchaseVatRate(){
		return purchaseVatRate;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	public void setAttachmentCount(int attachmentCount){
		this.attachmentCount = attachmentCount;
	}

	public int getAttachmentCount(){
		return attachmentCount;
	}

	public void setInvoice(Invoice invoice){
		this.invoice = invoice;
	}

	public Invoice getInvoice(){
		return invoice;
	}

	public void setCostAccount(CostAccount costAccount){
		this.costAccount = costAccount;
	}

	public CostAccount getCostAccount(){
		return costAccount;
	}

	public void setLastUpdatedDateTime(String lastUpdatedDateTime){
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getLastUpdatedDateTime(){
		return lastUpdatedDateTime;
	}

	public void setInvoiceRowComment(String invoiceRowComment){
		this.invoiceRowComment = invoiceRowComment;
	}

	public String getInvoiceRowComment(){
		return invoiceRowComment;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	public void setEventDate(String eventDate){
		this.eventDate = eventDate;
	}

	public String getEventDate(){
		return eventDate;
	}

	@Override
 	public String toString(){
		return 
			"ResponseProjectTravelExpenses{" + 
			"invoiceRowGuid = '" + invoiceRowGuid + '\'' + 
			",vatRate = '" + vatRate + '\'' + 
			",project = '" + project + '\'' + 
			",description = '" + description + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",invoiceRowDescription = '" + invoiceRowDescription + '\'' + 
			",travelReimbursementRequired = '" + travelReimbursementRequired + '\'' + 
			",travelReimbursement = '" + travelReimbursement + '\'' + 
			",phase = '" + phase + '\'' + 
			",unitPrice = '" + unitPrice + '\'' + 
			",travelStartTime = '" + travelStartTime + '\'' + 
			",lastUpdatedBy = '" + lastUpdatedBy + '\'' + 
			",salesAccount = '" + salesAccount + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",unitCostExcludingPurchaseVat = '" + unitCostExcludingPurchaseVat + '\'' + 
			",billingSchedule = '" + billingSchedule + '\'' + 
			",costCenter = '" + costCenter + '\'' + 
			",travelEndTime = '" + travelEndTime + '\'' + 
			",billingDependencyPhase = '" + billingDependencyPhase + '\'' + 
			",plannedBillingDate = '" + plannedBillingDate + '\'' + 
			",measurementUnit = '" + measurementUnit + '\'' + 
			",isBillable = '" + isBillable + '\'' + 
			",invoiceQuantity = '" + invoiceQuantity + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",travelExpense = '" + travelExpense + '\'' + 
			",unitCost = '" + unitCost + '\'' + 
			",purchaseVatRate = '" + purchaseVatRate + '\'' + 
			",guid = '" + guid + '\'' + 
			",attachmentCount = '" + attachmentCount + '\'' + 
			",invoice = '" + invoice + '\'' + 
			",costAccount = '" + costAccount + '\'' + 
			",lastUpdatedDateTime = '" + lastUpdatedDateTime + '\'' + 
			",invoiceRowComment = '" + invoiceRowComment + '\'' + 
			",user = '" + user + '\'' + 
			",customer = '" + customer + '\'' + 
			",eventDate = '" + eventDate + '\'' + 
			"}";
		}
}
