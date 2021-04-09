public class Vip extends Customer{
	protected  double intake;//VIP的每日摄入量
	protected double tgtweight;//VIP的理想体重
	protected int period;//VIP达到理想体重所需的时间
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