//package loop;

public class Program8b {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		while(i<=100) {
			System.out.print(i+"*"+i+"+");
			sum=sum+i*i;
			i++;
		}
		
		System.out.println("\nsum is: "+sum );

	}

}
