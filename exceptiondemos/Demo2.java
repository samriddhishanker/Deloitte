package exceptiondemos;

public class Demo2 {
	String name;
	public void display() {
		System.out.println("welcome in display");
		try {
			System.out.println(name.length());
		} 
		catch (Exception e) {
			System.out.println("no name");
		}	
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Demo2 d= new Demo2();
		d.display();
		System.out.println("main ended");
	}
}