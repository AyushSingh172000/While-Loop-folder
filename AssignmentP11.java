//package loop;
import java.util.Scanner;
public class AssignmentP11 {

	public static void main(String[] args) {
		getSum();
	}
	public static void getSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println("The Sum of all the digit of a number is: "+sum);
		
	}

}
