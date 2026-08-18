package Inheritance;

class GrandFather{
	int G=20;
	void displayGrandFather() {
		System.out.println("GrandFather");
	}
}
class Father extends GrandFather{
	int F=10;
	void displayFather() {
		System.out.println("Father");
	}
}
/*
 * Father can access except private , parent's(GrandFather)
 * Data member and method
 * 1.F
 * 2.displayFather()
 * 3.G
 * 4.displayGrandFather()
 */
class Son extends Father{
	int S=5;
	void displaySon() {
		System.out.println("Son");
	}
}
/*
 * Son can access:
 * 1.S
 * 2.displaySon()
 * 3.F
 * 4.displayFather()
 * 5.G
 * 6.dosplayGrandFather()
 */
public class MultilevelInheritance {

	public static void main(String[] args) {
		GrandFather Pranay = new GrandFather();
		System.out.println("GrandFather Property :"+Pranay.G);
		Pranay.displayGrandFather();
		
		Father Pritam = new Father();
		System.out.println("GrandFather Property :"+Pritam.G);
		Pritam.displayGrandFather();
		System.out.println("Father Property: "+Pritam.F);
		Pritam.displayFather();
		
		Son Akash = new Son();
		System.out.println("GrandFather Property :"+Akash.G);
		Akash.displayGrandFather();
		System.out.println("Father Property: "+Akash.F);
		Akash.displayFather();
		System.out.println("Son Property :"+Akash.S);
		Akash.displaySon();
		
		
		

	}

}
