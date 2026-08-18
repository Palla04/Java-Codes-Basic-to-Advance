package ClassTest1;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x,y,i;
		int gcd = 0;
		System.out.println("Enter two numbers: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        for(i=1;i<=x && i<=y;++i)
        {
        	if(x%i==0 && y%i==0)
        	{
        		gcd = i;
        	}
        }
        int lcm = (x*y)/gcd;
        
        System.out.println("Gcd :"+gcd);
        System.out.println("Lcm :"+lcm);
        
	}

}
