package VismaSolutions.POJO.Invoices;

public class FreeText2{
	private Object text;
	private Object tagContext;
	private Object value;
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
			"FreeText2{" + 
			"text = '" + text + '\'' + 
			",tagContext = '" + tagContext + '\'' + 
			",value = '" + value + '\'' + 
			",allowTags = '" + allowTags + '\'' + 
			"}";
		}
}
