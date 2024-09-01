//package loop;
import java.util.Scanner;
public class AssignmentP10 {

	public static void main(String[] args) {
		getProduct();
	}
	public static void getProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int prod=1;
		while(n>0)
		{
			prod=prod*(n%10);
			n=n/10;
		}
		//System.out.println("Product of all digit is: "+prod);
		if(prod%2==0)
			System.out.println("Product of all digit is Even.");
		else
			System.out.println("Product of all digit is Odd.");
	}

}
