package ClassTest1;

import java.util.Scanner;

public class MagicNo {

		public static int Happy(int n) {
	    	 int r,sum=0;
	    	while(n>0)
	    	{
	    		r=n%10;
	    		sum += r;
	    		n=n/10;
	    	}
	    	return sum;
	    }
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter the number:");
			 n = sc.nextInt();
			 
			 int result = n;
			while(result>9)
			 {
				 result = Happy(result);
			 }
			 if(result == 1)
				 System.out.println("Magic No");
			 else
				 System.out.println("Not a Magic no");

	}

}
