//package loop;
import java.util.Scanner;
public class AssignmentP12 {

	public static void main(String[] args) {
	Printevensum();	
	}
	public static void Printevensum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem%2==0)
				sum=sum+rem;	
		}
		System.out.println("The Sum of all Even digit is: "+sum);
	}

}
