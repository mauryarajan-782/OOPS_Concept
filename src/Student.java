public class Student {
	
	String name;
	
	public Student(){
		name = "Deepak";
	}
	
	public void print() {
		System.out.println("Name: " + name);
	}

	public static void main(String[]args) {
		Student s1 = new Student();
		s1.print();
	}
}