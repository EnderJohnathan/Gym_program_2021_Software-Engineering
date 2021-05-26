
public class Customer {
    // least required info
    protected String username = null;
    protected String password = null;
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

  
}
