package ClassTest1;
import  java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag=0;
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		
		int r=x*x;
		
		while(x>0)
		{
			if(r%10 == x%10)
			{
				flag=1;
			}
			r=r/10;
			x=x/10;
		}
		if(flag == 1)
		   System.out.println("Automorphic no.");
		else
			System.out.println("Not Automorphic no.");
		

	}

}
