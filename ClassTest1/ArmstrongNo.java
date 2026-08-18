package ClassTest1;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNo {

	public static void main(String[] args) {
		int result=0;
		int r,n = 0;
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number: ");
			int p=scan.nextInt();
			int x=p;
			
			while(x!=0){
				x/=10;
				++n;
			}
			x=p;
			while(x!=0)
			{
				r=x%10;
				result += Math.pow(r, n);
				x = x/10;
			}
			if(result==p)
			{
				System.out.println("armstrong no.");
			}
			else
			{
				System.out.println("Not A No");
			}
	}

}
