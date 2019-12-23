package demo;

public class Demo2 {
	
	int i=10;
	int num1=20;
	int num2=i;
	public void display()
	{
		System.out.println(i+num1+num2);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();
	}

}
