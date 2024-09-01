//package loop;
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,i=0;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(i<=n) 
		{
			i=a+b;
			System.out.println(i);
			a=b;
			b=i;
			i++;
			
		}

	}

}
