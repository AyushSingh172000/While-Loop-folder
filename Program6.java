//package loop;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getFactors(n);
	}
		public static void getFactors(int n)
		{
			int i=1;
			int count=0;
			while(i<=n/2) {
				if(n%i==0) {
					System.out.println(i);
					count++;
				}
				i++;
				
				}
			System.out.println("The Count of the factors are: "+count);
			
		}
		}
		
	


