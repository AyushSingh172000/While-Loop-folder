//package loop;
import java.util.Scanner;
public class AssignmentP3 {

	public static void main(String[] args) {
	Printodd();	
	}
	public static void Printodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem%2!=0)
			{
				System.out.println(+rem+":is the odd digit.");
			}
//			else
//				System.out.println();
		}
	}

}

