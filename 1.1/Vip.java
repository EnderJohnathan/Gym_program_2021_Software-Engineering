public class Vip extends Customer{
	protected  double intake;//VIP��ÿ��������
	protected double tgtweight;//VIP����������
	protected int period;//VIP�ﵽ�������������ʱ��
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