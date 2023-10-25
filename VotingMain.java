package onlinevotingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class VotingMain {
	 static Scanner sc=new Scanner(System.in);
	  static ArrayList<User> l1=new ArrayList<>();
	  static  String temp;

	public static void main(String[] args) throws InterruptedException {
		l1.add(new User("mani",4321,false));
		l1.add(new User("bhargav",1234,true));
		System.out.println("******************** WELCOME TO ONLINE VOTING SYSTEM *********************");
		System.out.println("  1.Existing User ");
		System.out.println("  2.New User ");
		System.out.println("**************************************************************************");
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			existingUser();
		    break;
		case 2:
			System.out.println("Enter Your name:");
			String s=sc.next();
			System.out.println("Create Your Pin :");
			int p=sc.nextInt();
			User user=new User(s,p,false);
			l1.add(user);
			System.out.println("Successfully Created Voter Account..!\n");
			System.out.println("Do you want to vote now? choose(yes or no):");
			temp=sc.next();
			if(temp.equals("yes"))
				existingUser();
			else
				System.out.println("Please Come After to Vote..!");
		}
		if(temp.equals("yes"))
		System.out.println("********     Results will Declare Soon..!   *********");
		System.out.println();
		System.out.println("******** Thank You for Using Online Voting System    *********");
		
	}
	public static void existingUser() throws InterruptedException {
		System.out.println("Enter Your User ID:");
		String id=sc.next();
		System.out.println("Enter Your PIN");
		int pin=sc.nextInt();
		boolean b=UserAccount.checkUser(l1,id, pin,false);
		if(b) {
			for (User user : l1) {
				if(user.getUserid().equals(id)) {
					user.setStatus(true);
				}
			}
			VotingApp.displayVotingOptions();
		}
		else {
			System.out.println("Invalid Credientials..!");
		}
		
	}
	
}
