package onlinevotingsystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingApp extends Thread {
	
	public static void displayVotingOptions() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("*******List of Parties in Election******** ");
		List<String> list=new ArrayList<>();
		list.add("       1.All India Trinamool Congress \n");
		list.add("       2.Bahujan Samaj Party  \n");
		list.add("       3.Bharatiya Janata Party  \n");
		list.add("       4.Communist Party of India \n");
		list.add("       5.Indian National Congress \n");
		list.add("       6.Nationalist Congress Party \n");
		list.add("       7.NOTA- None of the Above\n");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("Choose from the above options to Vote:");
		int partyno=sc.nextInt();
		System.out.println("Wait... We are submitting your vote \n");
		Thread.sleep(5000);
		LocalDate ld=LocalDate.now();
		LocalTime lt=LocalTime.now();
		System.out.println("You have Successfully Submitted your vote on "+ld+" at "+lt+"\n");
		
		
	}

}
