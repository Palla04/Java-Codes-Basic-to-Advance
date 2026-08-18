package Inheritance;
class Parent{
	int P=10;
	void displayParent(){
		System.out.println("parent");
	}
}
class Child extends Parent{
	int c=20;
	void displayChild(){
		System.out.println("child");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Parent Haripada = new Parent();
		System.out.println(Haripada.P);
		Haripada.displayParent();
		
		System.out.println();
		
		Child Darpan = new Child();
		System.out.println("Parent Property :"+Darpan.P);
        Darpan.displayParent();
        System.out.println("Child Property :"+Darpan.c);
        Darpan.displayChild();
	}

}