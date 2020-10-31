package VismaSolutions.POJO.Invoices;

public class FreeText1{
	private String text;
	private String tagContext;
	private Object value;
	private boolean allowTags;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setTagContext(String tagContext){
		this.tagContext = tagContext;
	}

	public String getTagContext(){
		return tagContext;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return value;
	}

	public void setAllowTags(boolean allowTags){
		this.allowTags = allowTags;
	}

	public boolean isAllowTags(){
		return allowTags;
	}

	@Override
 	public String toString(){
		return 
			"FreeText1{" + 
			"text = '" + text + '\'' + 
			",tagContext = '" + tagContext + '\'' + 
			",value = '" + value + '\'' + 
			",allowTags = '" + allowTags + '\'' + 
			"}";
		}
}
