package ClassTest1;

import java.util.Scanner;

public class CountDigit {

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
			System.out.println("No of digit :"+n);

	}

}
