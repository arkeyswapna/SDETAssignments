package Assignments;

import java.util.Iterator;

public class ReverseAString {

	public static void main(String[] args) {
		
		//1. Using String concatenation(+) operator
		
		String s="Swapna";
		String c ="";
//		int length = s.length();
//		for (int j =length-1 ; j >= 0; j--) {
//				
//				c=c+s.charAt(j);
//			}
//		System.out.println("Reversed string: "+c);
//		
		
		//2.Using character array
		
//		char a[]=s.toCharArray();
//		int length = a.length;
//		for (int i = length-1; i>=0; i--) {
//			
//			c=c+a[i];			
//		}
//		System.out.println("Reversed string: "+c);
		
		//3. Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		System.out.println("Reversed string: "+reverse);
		
	}

}
