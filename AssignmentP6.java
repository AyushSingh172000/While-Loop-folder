//package loop;
import java.util.Scanner;
public class AssignmentP6 {

	public static void main(String[] args) {
	Countevennumber();	
	}
	public static void Countevennumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem%2==0)
			{
				//System.out.println(+rem+"is the even digit.");
				count++;	
			}
		}
		System.out.println("even digit count is:"+count);
	}

}

