package org.string;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="Welcome to java class";
		System.out.println(r);
		String c=r.replace("java","python");
		System.out.println(c);
		//----------------------------------------
		String r1="Software Testing";
		System.out.println(r1);
		String c1=r1.replace("Software", "Automation");
		System.out.println(c1);
		//-----------------------------------
		String r2="Welcome to java class";
		System.out.println(r2);
		String c2=r2.replace(" ", "#");
		System.out.println(c2);
		//---------------------------------
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Email Id");
		String n=s.next();
		System.out.println("Email Id is :"+n);
		if(n.contains("gmail")) {
			System.out.println(n.replace("gmail", "yahoo"));
		}
		else {
			System.out.println("Invalid Address");
		}
		//------------------------------------------------
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your Address");
		String n1=s1.next();
		System.out.println("your Address is :"+n1);
		//boolean b=n.contains("@");
		//System.out.println(b);
		if(n1.contains("pincode")) {
			System.out.println(n1.replace("pincode", " "));
		}
		else {
			System.out.println("Invalid Address");
		}
		
		



	}

}
