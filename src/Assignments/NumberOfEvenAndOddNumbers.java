package Assignments;

public class NumberOfEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int num=22222222;
		int even=0;
		int odd=0;
		int b;
		while(num>0)
		{
			b=num%2;
			num=num/10;
			if(b==0)
				even++;
			else
				odd++;
			
			
		}
		System.out.println(even+" "+odd);
	}

}
