
public class Customer {
    // least required info
    protected String username = null;
    protected String password = null;
    // Optional attributes
    protected double balance;
    protected String gender;
    protected int age;
    protected double weight;
    protected int height;

    // Necessary methods
    public Customer() {
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Optional methods
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
}
