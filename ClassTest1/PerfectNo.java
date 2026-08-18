package ClassTest1;
import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int sum=0;
		
		int p = n;
			for(int i=1;i<n;i++)
			{
				 if(n%i==0) {
					 sum += i;
				 }
			}
		
		if(sum == p)
		{
			System.out.println("Perfect No");
		}
		else
		{
			System.out.println("Not Perfect No");
		}
	}

}
