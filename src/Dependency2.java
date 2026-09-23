class Whiteboard {
	
	void writeonboard() {
		System.out.println("Writing on the whiteboard");
	}
}

class Teacher {
	
	void teachlesson() {
		Whiteboard board = new Whiteboard();
		board.writeonboard();
		System.out.println("Explain the topics");
		
	}
}

public class Dependency2 {
	
	public static void main(String[]args) {
		
		Teacher teacher = new Teacher();
		teacher.teachlesson();
	}

}
