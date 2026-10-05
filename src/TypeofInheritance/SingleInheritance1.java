package TypeofInheritance;

class BankAccount{
	void accountType() {
		System.out.println("this is general BankAccount");
	}
	
}

class SavingAccount extends BankAccount{
	void interestRate() {
		System.out.println("offers bank account 4% interest");
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.accountType();
		sa.interestRate();

	}

}
