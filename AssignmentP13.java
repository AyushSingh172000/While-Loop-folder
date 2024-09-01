//package loop;
import java.util.Scanner;
public class AssignmentP13 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		geteachdigitFact(n);	
	}
	public static void geteachdigitFact(int n)
	{
		int rem=0;
		while(n>0)
		{
			 rem=n%10;
			 int i=1;
			 int fact=1;
			 while(i<=rem)
			 {
				
				 fact=fact*i;
				 i++;
			 }
			 System.out.println(fact+" is the factorial of "+rem+".");
			 n=n/10;	 
		}	
	}
}
