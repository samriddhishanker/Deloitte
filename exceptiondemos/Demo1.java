package exceptiondemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	
	int num1,num2;
	int result;
	Scanner sc=new Scanner(System.in);
	
	public void display() {
		System.out.println("welcome in display");
		try {
			System.out.println("enter number 1");
			num1=sc.nextInt();
			System.out.println("enter number 2");
			num2=sc.nextInt();
			result=num1/num2;
			System.out.println(result);
		}
		catch(InputMismatchException e){
			System.out.println("please enter a digit");
		}
		catch(ArithmeticException e){
			System.out.println("please enter a non zero number");
		}
		finally{	//GETS CALLED IN ALL SITUATIONS
			System.out.println("**FINALLY CALLED**");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		Demo1 d= new Demo1();
		d.display();
		System.out.println("Main Ended");
	}

}
