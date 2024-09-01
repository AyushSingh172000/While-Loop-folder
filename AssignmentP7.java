//package loop;
import java.util.Scanner;
public class AssignmentP7 {

	public static void main(String[] args) {
	Countoddnumber();	
	}
	public static void Countoddnumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			if(rem%2!=0)
			{
				//System.out.println(+rem+"is the even digit.");
				count++;	
			}
		}
		System.out.println("Odd digit count is:"+count);
	}

}

