package CollectionRelated;

public class Employee 
{
	private String name;
	
	public Employee( String name) {
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

