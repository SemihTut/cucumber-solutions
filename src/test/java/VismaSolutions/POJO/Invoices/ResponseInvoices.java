package VismaSolutions.POJO.Invoices;

import java.util.List;

public class ResponseInvoices{
	private List<DataItem> data;
	private Object header;
	private Object totalCount;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setHeader(Object header){
		this.header = header;
	}

	public Object getHeader(){
		return header;
	}

	public void setTotalCount(Object totalCount){
		this.totalCount = totalCount;
	}

	public Object getTotalCount(){
		return totalCount;
	}

	@Override
 	public String toString(){
		return 
			"ResponseInvoices{" + 
			"data = '" + data + '\'' + 
			",header = '" + header + '\'' + 
			",totalCount = '" + totalCount + '\'' + 
			"}";
		}
}