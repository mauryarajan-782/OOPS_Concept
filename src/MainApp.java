public class MainApp {

	public static void main(String[] args) {
			
		Address address = new Address();
			
		Student student = new Student(address);
		
		student.displayinfo();
		
	}
}

