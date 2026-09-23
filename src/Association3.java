class Processor{
	void startProcessor() {
		System.out.println("Start Processor");
	}
}

class Laptop{
	
	private Processor processor;
	
	public void setLaptop(Processor processor) {
		this.processor = processor;
	}
	
	void startLaptop() {
		processor.startProcessor();
		System.out.println("Start Laptop");
	}
}

public class Association3 {
	
	 public static void main(String[]args) {
		 
		 Processor processor = new Processor();
		 
		 Laptop mylaptop = new Laptop();
		 mylaptop.setLaptop(processor);
		 mylaptop.startLaptop();
	 }

}
