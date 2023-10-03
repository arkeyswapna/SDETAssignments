package Assignments;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("Before swapping values are: "+a+" "+b);
		//logic 1 -Third Variable
//		int t=a;
//		a=b;
//		b=a;
		
		//Logic - use + and - without using third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//Logic 3 - Use * and l without using third variable
		//here a & b values should not be zero
//		a=a*b;
//		b=a/b;
//		a=b/a;
		
		//Logic 4 - bitwise XOR(^)
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		//Logic 5 - Single statement
		b=a+b-(a=b);//<-----executes from right to left in this statement
		
		System.out.println("After swapping values are: "+a+" "+b);

	}

}
