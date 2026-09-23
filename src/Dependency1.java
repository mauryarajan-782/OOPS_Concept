class Officeworker {
	
	void work(String doc) {
		System.out.println("Worked Completed");
	}
}

class Printer {
	
	void print() {
		Officeworker worker = new Officeworker();
		worker.work("Report doc.pdf");
		System.out.println("Printing the Document");
		
	}
}

public class Dependency1 {
	
	public static void main(String[]args) {
		
		Printer printer = new Printer();
		printer.print();
	}

}
