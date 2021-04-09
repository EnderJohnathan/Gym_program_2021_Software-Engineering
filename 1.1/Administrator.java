public class Administrator{
	  // Optional methods
	protected double balance;
	protected double amount;
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void Checkin(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Your balance is not enough! Please top-up and try again.");
        }
    }
    public void emend(){
        //emend the personal and balance information of the customers
    }
}