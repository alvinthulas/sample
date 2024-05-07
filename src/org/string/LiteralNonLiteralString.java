package org.string;

public class LiteralNonLiteralString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		String s2="JAVA";
		String s3="selenium";
		String s4="selenium";
		String s5="java";
		String s6="program";
		String s7="javaprogram";
		String s8=new String("java");
		String s9=new String("program");
		String s10=new String("javaprogram");
		
		System.out.println("s1 :"+System.identityHashCode(s1));
		System.out.println("s2 :"+System.identityHashCode(s2));
		System.out.println("s3 :"+System.identityHashCode(s3));
		System.out.println("s4 :"+System.identityHashCode(s4));
		System.out.println("s5 :"+System.identityHashCode(s5));
		System.out.println("s6 :"+System.identityHashCode(s6));
		System.out.println("s7 :"+System.identityHashCode(s7));
		System.out.println("s8 :"+System.identityHashCode(s8));
		System.out.println("s9 :"+System.identityHashCode(s8));
		System.out.println("s10 :"+System.identityHashCode(s8));
		//System.out.println("s8 :"+System.identityHashCode(s8));







	}

}
