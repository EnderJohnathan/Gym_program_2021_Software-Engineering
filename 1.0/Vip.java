public class Vip extends Customer{
    public Vip() {
    }

    public Vip(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Optional methods
    public void interact(){
        //Vip interact with an exclusive coach
    }
}