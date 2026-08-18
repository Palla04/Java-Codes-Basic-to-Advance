package ClassTest1;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		while(n != 0)
		{
			int r= n%10;
			sum = sum+r;
			n /= 10;
		}
		System.out.println(sum);
	}

}
