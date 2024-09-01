//package loop;
import java.util.Scanner;
public class AssignmentP5 {

	public static void main(String[] args) {
	Countnumber();	
	}
	public static void Countnumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			
				count++;	
			
//			else
//				System.out.println();
		}
		System.out.println("The digits count is:"+count);
	}

}
