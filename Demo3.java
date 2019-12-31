package exceptiondemos;

public class Demo3 {
	
	public void display() {
		System.out.println("welcome in display");
		try {
			Thread.sleep(1000);	//checked exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Demo3 d= new Demo3();
		d.display();
		System.out.println("main ended");
	}
}