//package loop;
import java.util.Scanner;
public class AssignmentP16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		getReverse(n);
		}
	public static void getReverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			System.out.print(rev);
		}
		System.out.println(":-is a reverse of a given number.");
		
		
	}

}
