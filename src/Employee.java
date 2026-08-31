public class Employee {
	
	String name;
	int id;
	
	Employee(String n, int i){
		name = n;
		id = i;
	}
	
	public void print() {
		System.out.println("Name: " + name + "Id: " + id);
		System.out.println("Id: " + id);
	}
	
	public static void main(String[]args) {
		Employee e1 = new Employee("Deepak", 101);
		e1.print();
	}
}
