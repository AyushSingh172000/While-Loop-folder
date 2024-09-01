//package loop;
import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int fact=1;
		int i=n;
		while(i>0) {
			fact=fact*i;
			i--;
			}
		System.out.println("Factorial number is: "+fact);
	}
}
