//ackage loop;
import java.util.Scanner;
public class AssignmentP17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		getReverse(n);
		//int palindrome=n;
//		if(palindrome==getReverse(n))
//			System.out.println("This is a Palindrome number.");
//		else
//			System.out.println("This is not a Palindrome number.");
//		//System.out.println(Rev);
		}
	public static void getReverse(int n)
	{
		int z=n;
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			//rev=n%10;
			n=n/10;
			//System.out.print(rev);
		}
		//System.out.println(":-is a reverse of a given number.");
		if(z==rev)
			System.out.println("This is a Palindrome number.");
		else
			System.out.println("This is not a Palindrome number.");
		
	}

}

