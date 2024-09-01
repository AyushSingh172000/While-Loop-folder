//package loop;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the range: ");
		//int range=sc.nextInt();
		int i=1000;
		int count=0;
		while(i<=2000) {
			if(i%10==7 && i%7==0) {
				System.out.println(i);
				count++;
			}
		i++;
		}
		System.out.println("Total such numbers are: "+count);
		
	}

}
