package abstract_01;

abstract class BankAccount {
	
	double balance;
	
	BankAccount(double balance) {
        this.balance = balance;
    }

	 // Abstract method (to be implemented by subclasses)
    abstract void calculateInterest();

    // Concrete method
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

}
