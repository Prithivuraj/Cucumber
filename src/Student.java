
public class Student {
	int id;
	String name;
	
	public static void main(String[] args) {
		String changeName = "Sahana";
		Student s1 = new Student(100,"Diwahar");
		s1.changeName("Divya");
		Student s2 = new Student(101,"Prithiv");
		System.out.println(changeName);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
	
	public void changeName(String changeName) {
		this.name = changeName;
		System.out.println(this.name);
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
