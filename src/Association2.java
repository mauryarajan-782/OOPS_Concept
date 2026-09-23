class Engine {

	void startEngine() {
		System.out.println("Engine Starts");
	}
}

class Car {
	 private Engine engine;
	 
	 Car(Engine engine){
	 	this.engine = engine;
	 }
	 
	 void startCar() {
		 engine.startEngine();
		 System.out.println("Car Start");
	 }
}

public class Association2 {
	
	public static void main(String[]args) {
		
		Engine engine = new Engine();
		
		Car car = new Car(engine);
		car.startCar();
		
		
	}
}