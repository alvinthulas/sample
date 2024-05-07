package org.string;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to java class";
		boolean b=s.startsWith("Welcome");
		System.out.println(b);
		//-------------------------------------
		String s1="Selenium tool";
		boolean b1=s.endsWith("Welcome");
		System.out.println(b1);
		//--------------------------------------
		String s2="Welcome to java class";
		boolean b2=s2.endsWith("class");
		System.out.println(b2);
		//--------------------------------
		String s3="Welcome to java class";
		boolean b3=s3.endsWith("java");
		System.out.println(b3);
		//-----------------------------------------
		
		String s4="Welcome to java class";
		boolean b4=s4.isEmpty();
		System.out.println(b4);
		/*if(s4.isEmpty()) {
			System.out.println("it is empty");
		}
		else {
			System.out.println("it is not empty");
		}
		*/
		//-------------------------------------
		String s5=" ";
		boolean b5=s5.isEmpty();
		System.out.println(b5);
		
		

	}

}
