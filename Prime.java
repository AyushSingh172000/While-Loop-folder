//package loop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(isPrime(n))
			System.out.println(n+" is a Prime number.");
		else
			System.out.println(n+" is not a Prime number.");
	}
		
	public static boolean isPrime(int n)
		{
		if(n<2)
			return false;
			int i=2;
			while(i*i<=n)//i<=Math.sqrt(n))//i<=n/2)
			{
				//System.out.println("Loop execution is: "+(i-1));
				if(n%i==0)
					return false;
				i++;
			}
		return true;
		}

	}


