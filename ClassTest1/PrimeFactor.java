package ClassTest1;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int j,flag = 0;
		System.out.println("Enter the number: ");
		x = sc.nextInt();
		int i;
		for(i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println(i);
				}
			}
			
		}
		
	}

}
