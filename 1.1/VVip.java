public class VVip extends Vip{
    public VVip() {
    }

    public VVip(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //optional methods
    public void Checkin() {
        //VVip gets all services for free
    }
}