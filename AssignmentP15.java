//package loop;

import java.util.Scanner;

public class AssignmentP15 {public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	checkStrong(n);	
}
public static void checkStrong(int n)
{
	int strong=n;
	int rem=0;
	int sum=0;
	while(n>0)
	{
		 rem=n%10;
		 int i=1;
		 int fact=1;
		 while(i<=rem)
		 {
			 fact=fact*i;
			 i++;
		 }
		 System.out.println(fact+" is the factorial of "+rem+".");
		 n=n/10;
		 sum=sum+fact;
		 
	}	
	System.out.println(sum+":-is the Sum of factorial of each digit of number.");
	
	if(strong==sum)
		System.out.println(strong+":-This is a Strong Number.");
	else
		System.out.println(strong+":-This is not a Strong Number.");
}

}
