//package loop;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range=sc.nextInt();
		int i=1;
		while(i<=range) {
			if(i%10==7)
				System.out.println(i);
		i++;
		}
		
	}

}
