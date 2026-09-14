package association2;

public class MainApp{
	
	public static void main(String[]args) {
		
		Engine engine = new Engine();
		Car myCar = new Car(engine);
		myCar.driveCar();
	}
}
