package org.string;
import java.util.Scanner;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st input:");
		String i=s.next();
		System.out.println(i);
		System.out.println("Enter 2nd input:");
		String i1=s.next();
		System.out.println(i1);
		boolean a=i.equals(i1);
		System.out.println(a);
		System.out.println("Enter 3rd input:");
		String i2=s.next();
		System.out.println(i2);
		System.out.println("Enter 4th input:");
		String i3=s.next();
		System.out.println(i3);
		boolean a1=i2.equals(i3);
		System.out.println(a1);
		System.out.println("Enter 5th input:");
		String i4=s.next();
		System.out.println(i4);
		System.out.println("Enter 6th input:");
		String i5=s.next();
		System.out.println(i5);
		boolean a2=i4.equalsIgnoreCase(i5);
		System.out.println(a2);
		System.out.println("Enter 7th input:");
		String i6=s.next();
		System.out.println(i6);
		System.out.println("Enter 8th input:");
		String i7=s.next();
		System.out.println(i7);
		boolean a3=i6.equalsIgnoreCase(i7);
		System.out.println(a3);
		
		
		
		
		
		
		

	}

}
