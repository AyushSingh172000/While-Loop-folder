//package loop;
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n) {
			if(n%i==0) 
			{
				count++;
			}
			i++;
		}
			if(count<=2) {
				System.out.println(n+" is a Prime number.");
			}
			else {
				System.out.println(n+" is not a Prime number.");
			}
			sc.close();
		}
		
	}


		

	


