package oops;

import java.util.Scanner;

public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;
	Scanner scanner = new Scanner(System.in);
	
	public void takeSalary()//int employeeId,String employeeName,String employeeAddress,int salary)
	{
		System.out.println("enter employee id");
		employeeId=scanner.nextInt();
		System.out.println("enter employee name");
		employeeName=scanner.next();
		System.out.println("enter employee address");
		employeeAddress=scanner.next();
		System.out.println("enter employee salary");
		salary=scanner.nextInt();
		/*this.employeeId = employeeId;
		this.employeeName = "employeeName";
		this.employeeAddress = "employeeAddress";
		this.salary = salary;*/
	}
	public void printEmployeeDetails()
	{
		System.out.println("employee id:" +employeeId);
		System.out.println("employee name:" +employeeName);
		System.out.println("employee address:" +employeeAddress);
		System.out.println("employee salary:" +salary);
	}
}
