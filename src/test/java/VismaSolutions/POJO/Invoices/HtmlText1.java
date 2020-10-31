package VismaSolutions.POJO.Invoices;

public class HtmlText1{
	private Object text;
	private String tagContext;
	private String value;
	private boolean allowTags;

	public void setText(Object text){
		this.text = text;
	}

	public Object getText(){
		return text;
	}

	public void setTagContext(String tagContext){
		this.tagContext = tagContext;
	}

	public String getTagContext(){
		return tagContext;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
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
			"HtmlText1{" + 
			"text = '" + text + '\'' + 
			",tagContext = '" + tagContext + '\'' + 
			",value = '" + value + '\'' + 
			",allowTags = '" + allowTags + '\'' + 
			"}";
		}
}
