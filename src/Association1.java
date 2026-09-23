class Address{
	
	String city = "Delhi";
	String country = "India";

	void displayAddress() {
		System.out.println("city : " + city + ", country : " + country);
	}
}
	
class Student{
	
	String name = "Deepak";
	int rollno = 101;
	
	private Address address;
	
	Student(Address address){
		this.address = address;
	}
	
	void displayinfo() {
		System.out.println("name : " + name + ", rollno : " + rollno);
		address.displayAddress();
	}
}


public class Association1 {

	public static void main(String[] args) {
			
		Address address = new Address();
			
		Student student = new Student(address);
		
		student.displayinfo();
		
	}
}


	
