package assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many Employees:");
		int employeeNumber = scanner.nextInt();
		
		EmployeeBo employee = new EmployeeBo();
		EmployeeVo[] employees = new EmployeeVo[employeeNumber];
		
		int len=employees.length;
		for (int i = 0; i < len ; i++) 
		{
			System.out.println("Enter Employee "+i+" details-ID, NAME, INCOME");
			employees[i] = new EmployeeVo(scanner.nextInt(),scanner.next(), scanner.nextInt(), 0);
		}
		
		for (EmployeeVo e : employees) {
			employee.calculateIncomeTax(e);
			System.out.println(e);
		}
		
		List<EmployeeVo> list = Arrays.asList(employees);
		Collections.sort(list, new EmployeeSort());

		System.out.println("Sorted Array: ");
		System.out.println(list);
	}

}
