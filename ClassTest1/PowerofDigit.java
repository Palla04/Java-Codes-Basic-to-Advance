package ClassTest1;

import java.util.Scanner;

public class PowerofDigit {

	public static void main(String[] args) {
		int r,n,p;
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number: ");
		    n=scan.nextInt();
		    System.out.println("Enter the power: ");
		    p=scan.nextInt();
		    
		    r=Power(n,p);
		    System.out.println(r);
	}
	public static int Power(int n,int p)
	{
		if(p == 0)
			return 1;
		else
		{
			return (n * Power(n,p-1));
		}
	}

}
