//package loop;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the range: ");
		//int range=sc.nextInt();
		int i=1;
		while(i<=1000) {
			if(i%10==8 && i%8==0 )
				System.out.println(i);
		i++;
		}
		//System.out.println("Total such numbers");
		
	}

}
