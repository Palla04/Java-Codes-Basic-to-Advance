package ClassTest1;
import java.util.Scanner;
public class StrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r,sum=0;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		
		int p=n;
		while(n>0)
		{
			r=n%10;
			int f = fact(r);
			sum += f;
			n=n/10;
			
		}
		if(p==sum)
			System.out.println("Strong No");
		else
			System.out.println("Not a Strong NO");

	}
	public static int fact(int r)
	{
		int f=1;
		int i;
		for(i=1;i<=r;i++)
		{
			f=f*i;
		}
		return f;
	}

}
