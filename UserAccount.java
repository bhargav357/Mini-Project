package onlinevotingsystem;

import java.util.ArrayList;
import java.util.List;


public class UserAccount {
	String userid;
     int pin;
     

	public static boolean checkUser(List<User> l1,String username,int pass,boolean status) throws InterruptedException
	{
		for(User ux:l1) {
			if(ux.getUserid().equals(username) && ux.getPin()==pass) {
				if(ux.status) {
					System.out.println("You hava Already Voted!");
					System.exit(0);
				   }
				else
				    return true;
				
			}
			
		}
		return false;
		
	}
	
		
}
	


