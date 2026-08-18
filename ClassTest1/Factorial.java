package ClassTest1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= scan.nextInt();
		int fact=1;
		
		if(n<=0)
		{
			fact=n;
		}
		else
		{
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
		}
		System.out.println("Factorial :"+fact);
		

	}

}
