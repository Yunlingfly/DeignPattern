package wan;

public class Curriculum implements Cloneable{
	
	private String name;
	private String id;
	private String child;
	private String[] childArray;
	
	public String[] getChildArray() {
		return childArray;
	}
	public void setChildArray(String[] childArray) {
		this.childArray = childArray;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
