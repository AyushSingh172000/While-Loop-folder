//package loop;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n/2) {
			if(n%i==0)
				System.out.println(i);
				
			i++;
			}
		System.out.println("These are all the Factors.");
		
		}
		
		

	}


