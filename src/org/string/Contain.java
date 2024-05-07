package org.string;

import java.util.Scanner;

public class Contain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Email Id");
		String n=s.next();
		System.out.println("Email Id is :"+n);
		//boolean b=n.contains("@");
		//System.out.println(b);
		if(n.contains("@")) {
			System.out.println("valid Address");
		}
		else {
			System.out.println("Invalid Address");
		}
		//---------------Address------------------------------------
		System.out.println("Enter your Address");
		String n1=s.next();
		System.out.println("Your Address is :"+n1);
		boolean b1=n1.contains("pincode");
		System.out.println(b1);
		//-------------Email address true or false-----------------
		System.out.println("Enter your Email Id");
		String n2=s.next();
		System.out.println("Email Id is :"+n2);
		boolean b2=n2.contains("@");
		System.out.println(b2);
		//----------------------------------------------------
	
		        System.out.print("Enter a phone number: ");
		        String phoneNumber = s.next();
		        System.out.println("your phone number:"+phoneNumber);

		        // Remove all non-digit characters from the phone number
		        String cleanedNumber = phoneNumber.replaceAll("[^\\d]", "");

		        // Check if any character is present
		        if (phoneNumber.length() != cleanedNumber.length()) {
		            System.out.println("Invalid phone number. Please enter digits only.");
		        } else {
		            System.out.println("Valid phone number.");
		        }
		    }
		




	}


