//package loop;
import java.util.Scanner;
public class Assingnment1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		//System.out.println(Printdigit(n));
	Printdigit(n);	
	}
	public static void Printdigit(int n)
	{
		
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		//return rem;
		System.out.print(":-These are the Digits in a number.");
		
		
	}

}
