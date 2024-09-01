//package loop;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
	Printeven();	
	}
	public static void Printeven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem%2==0)
			{
				System.out.println(+rem+":is the even digit.");
			}
//			else
//				System.out.println();
		}
	}

}
