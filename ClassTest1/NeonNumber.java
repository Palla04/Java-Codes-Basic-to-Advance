package ClassTest1;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int r;
		int sum=0;
		int result = n*n;
		System.out.println(result);
		int m = result;
		while(m!=0)
		{
			r=m%10;
			sum=sum+r;
			m/=10;
		}
		System.out.println(sum);
		if(sum == n)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
		
	}
		
}
