//package loop;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args)
	{
		ReverseNum();	
	}
	public static void ReverseNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		//int rev=n;
		while(n>0)
		{
			   int rev=n%10;
			  System.out.print(rev);
			n=n/10;
			//System.out.println("The digit is: "+rev);
			//System.out.println("The Reverse number is: "+n);
		}
		System.out.println(":is the Reverse number.");
		
		
	}

}
