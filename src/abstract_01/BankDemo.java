package abstract_01;

public class BankDemo {

	public static void main(String[] args) {

		BankAccount savings = new SavingsAccount(10000);
        BankAccount current = new CurrentAccount(10000);

        savings.calculateInterest();
        current.calculateInterest();

        savings.displayBalance();
        current.displayBalance();
    
	}

}
