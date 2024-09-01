//package loop;
import java.util.Scanner;
public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		//double c=Math.pow(a,b);
		System.out.println(a+" to Power "+b+" is "+getPower(a,b));
		}
	public static int getPower(int a,int b)
	{
		int pow=1;
		int i=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
	return pow;
	}
}

