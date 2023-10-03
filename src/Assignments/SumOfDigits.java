package Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num=12345;
		int b=0,i=0;
		while(num>0)
		{
			b=b+num%10;
			num=num/10;
			
		}
		System.out.println("Sum of Digits: "+b);
	}

}
