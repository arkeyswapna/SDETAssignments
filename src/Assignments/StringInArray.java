package Assignments;

import java.util.Iterator;

public class StringInArray {

	public static void main(String[] args) {
		String a[]= {"abc","xyz","111","sai"};
		String s="xyz";
		
		
		for (int i = 0; i < a.length-1; i++) {
			if(s.equals(a[i]))
			{
				System.out.println(s+" is present in the array");
				break;
			}
			
			
		}
		

	}

}
