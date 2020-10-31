package VismaSolutions.POJO.Invoices;

public class HtmlText2{
	private Object text;
	private Object tagContext;
	private String value;
	private boolean allowTags;

	public void setText(Object text){
		this.text = text;
	}

	public Object getText(){
		return text;
	}

	public void setTagContext(Object tagContext){
		this.tagContext = tagContext;
	}

	public Object getTagContext(){
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
			"HtmlText2{" + 
			"text = '" + text + '\'' + 
			",tagContext = '" + tagContext + '\'' + 
			",value = '" + value + '\'' + 
			",allowTags = '" + allowTags + '\'' + 
			"}";
		}
}
