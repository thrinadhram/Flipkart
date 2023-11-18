package sriramjava;

public class A {
	public void m1() {
		System.out.println("m1");
		
	}
void m2() {
	System.out.println("m2");

	}
protected void m3() {
	System.out.println("m3");
	
}
public void m4() {
	System.out.println("m4");
	
}
public static void main(String[] args) {
	A a = new A();
	a.m1();
	a.m2();
	a.m3();
	a.m4();
}
}
