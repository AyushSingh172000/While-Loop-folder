//package loop;
import java.util.Scanner;
public class AssignmentP4 {

	public static void main(String[] args) {
	Greater5();	
	}
	public static void Greater5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem>5)
			{
				//System.out.println(+rem+":is the digit which is greater than 5.");
				System.out.print(rem+" ");
			}
//			else
//				System.out.println();
		}
		System.out.println(":are all the digit which are greater than 5.");
	}

}
