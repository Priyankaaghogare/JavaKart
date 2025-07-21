package com.user;

import java.util.Scanner;

public class UserRgist {
	
	public void main(){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("----------Welcom To JavaKart----------");
		System.out.println("Register Yourself First.....");
		System.out.println("Enter Your Name:");
		String nm = sc.next();
		System.out.println("Enter Your Mobile Number:");
		long mn = sc.nextLong();
		System.out.println("Enter Your Email:");
		String em = sc.next();
		System.out.println("Enter Your User Name:");
		String usn = sc.next();
		System.out.println("Enter Your Password:");
		String ps = sc.next();
		System.out.println("Registretion Successfull!!!");
		System.out.println("You Can Shop Now....");
		System.out.println("Enter your choice code from below list");
		System.out.println("1.Loing");
		System.out.println("2.Logout");
		int choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("Enter Your Username OR Email : ");
			String usrnm = sc.next();
			
			if(usrnm.equals(usn)) {
				System.out.println("Enter Your Password");
			} else {
				System.out.println("Incorrect");
				
			}
			
  			String pass = sc.next();
		    if(pass.equals(ps)) {
			System.out.println("Login Sucessfull!!!");
		
			} else {
			System.out.println("Please Enter correct PassWord");
			System.exit(choice);
			}
		
			
		} else {
			System.out.println("Logged Out Successfully!!!");
			
		}
		
	
	   
	}	 
}
