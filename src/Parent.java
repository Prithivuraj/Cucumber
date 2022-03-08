
public class Parent {
	
	String parentName;
	int parentAge;
	
	public String getParentName() {
		return parentName;
	}
	
	public int getParentAge() {
		return parentAge;
	}
	
	/*public Parent(String parentName, int parentAge) {
		this.parentName = parentName;
		this.parentAge = parentAge;
	}*/
	
	public Parent() {
		System.out.println("This is from parent");
	}
	

	public static void main(String[] args) {
//		Parent p1 = new Parent("Diwahar",29);
		
		Parent p1 = new Parent();
		Child c1 = new Child();
	}
	

}