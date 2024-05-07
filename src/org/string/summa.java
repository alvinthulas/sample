package org.string;

public class summa {
	public static void main(String[] args) {
	String input = "WelcomE";
	
	 StringBuilder result = new StringBuilder();
	
	for(int i = 0 ; i<input.length();i++)
	 {
	 char c = input.charAt(i);
	
	 if(Character1.isUpperCase(c))
	 {
	 result.append(Character1.toLowerCase(c));
	}
	else if(Character1.toLowerCase(c))
	 {
	 result.append(Character1.isUpperCase(c));
	 }
	 else
	{
  result.append(c);
	 }
	 }
	 System.out.println(input); 
	 System.out.println(result);
	
}
}
