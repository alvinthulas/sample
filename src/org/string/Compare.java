package org.string;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Word:");
		String n=s.next();
		System.out.println("your word is:");
		System.out.println("Enter another word:"+n);
		String n1=s.next();
		System.out.println("your word is:"+n1);
		int d=n.compareTo(n1);
		System.out.println(d);
		boolean f=n.equals(n1);
		System.out.println(f);
		

	}

}
