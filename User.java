package onlinevotingsystem;

public class User {
	private String userid;
	private int pin;
	boolean status;
	
	User(){}
	public User(String userid, int pin,boolean status) {
		super();
		this.userid = userid;
		this.pin = pin;
		this.status=status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", pin=" + pin + "]";
	}
	
}
