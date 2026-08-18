package ClassTest1;
import java.util.Scanner;
public class Fibinacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,t1=0,t2=1,i;
		int next=t1+t2;
		System.out.println("Enter the number : ");
		n=scan.nextInt();
		
		for(i=1;i<=n;i++)
		{
			next=t1+t2;
			System.out.println(t1+" ");
			t1=t2;
			t2=next;
		}

	}

}
