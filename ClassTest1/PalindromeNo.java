package ClassTest1;
import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		int r;
		int result=0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int p = scan.nextInt();
			int n=p;
			
			while(n>0)
			{
				r=n%10;
				result = (result*10)+r;
				n=n/10;
			}
			System.out.println(result);
			
			if(result==p)
			{
				System.out.println("Palindrome No.");
			}
			else
			{
				System.out.println("Not Palindrome No.");
			}
		}
		

	}

}
