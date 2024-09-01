//package loop;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) 
		{
			if(i%2==0)
				System.out.println(i);
			i++;
			
		}
		System.out.println("These are all the even numbers.");

}
}