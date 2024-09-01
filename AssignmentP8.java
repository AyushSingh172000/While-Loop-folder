//package loop;
import java.util.Scanner;
public class AssignmentP8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBigdigit();

	}
	public static void getBigdigit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int big=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem>big)
				big=rem;
		}
		System.out.println(big+":-is the biggest digit in a number.");
	}

}
