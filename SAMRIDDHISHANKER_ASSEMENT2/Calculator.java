package assignment2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Arithmetic []obj={new Add1(), new Sub1(), new Mul1(), new Div1()};
		/*Arithmetic add = new Add1();
		Arithmetic sub = new Sub1();
		Arithmetic mul = new Mul1();
		Arithmetic div = new Div1();*/
		
		System.out.println("Enter your choice:");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter first number: ");
		int num2 = sc.nextInt();
		
		/*add.calculate(num1, num2);
		sub.calculate(num1, num2);
		mul.calculate(num1, num2);
		div.calculate(num1, num2);*/
		int result = (obj[input-1]).calculate(num1, num2);
		System.out.println("result is : "+result);

	}
}
