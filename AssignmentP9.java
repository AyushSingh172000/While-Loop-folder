//package loop;
import java.util.Scanner;
public class AssignmentP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		getBigdigit(n);

	}
	public static void getBigdigit(int n)
	{
		
		int big=0;
		int small=9;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem<small)
				small=rem;
			if(rem>big)
				big=rem;	
		}
		//System.out.println(small);
		//System.out.println(big);
		System.out.println("The difference between "+big+" and "+small+" is:- "+(big-small));
	}

}
