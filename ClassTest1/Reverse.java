package ClassTest1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		int r;
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number: ");
			int x=scan.nextInt();
			
			while(x!=0)
			{
				r=x%10;
				System.out.print(r);
				x=x/10;
			}

	}

}
