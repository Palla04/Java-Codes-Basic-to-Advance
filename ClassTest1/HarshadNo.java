package ClassTest1;
import  java.util.Scanner;
public class HarshadNo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int r,sum=0;
		int p = n;
		while(n>0)
		{
			r=n%10;
			sum =sum+r;
			n=n/10;
		}
		if(p%sum==0)
			System.out.println("Harshad No");
		else
			System.out.println("Not Harshad No");

	}

}
