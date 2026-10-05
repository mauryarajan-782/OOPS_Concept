package TypeofInheritance;

class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	void Bark() {
		System.out.println("Dog is barking");
	}
}

class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy is weeping");
	}
}


public class MultilevalInheritance2 {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
		p.eat();
		p.Bark();
		p.weep();
	}

}
