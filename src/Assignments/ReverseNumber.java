package Assignments;

public class ReverseNumber {

	public static void main(String[] args) {
		//1. using algorithm
		int a=163;
		int b=0;
		while(a>0)
		{
		b=b*10+a%10;
		a=a/10;
		}
		System.out.println(b);
		
		//2. Using StringBuffer class
//		int num=1637;
//		StringBuffer rev;
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		rev=sb.reverse();
//		System.out.println(rev);
		
		//3. Using StringBuilder class
//		int num=1637;
//		StringBuilder sbl=new StringBuilder();
//		StringBuilder append = sbl.append(num);
//		StringBuilder rev = sbl.reverse();
//		System.out.println(rev);
		
		if(a==b)
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrome");
			
		

	}

}
