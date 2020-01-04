package assignment2;

public class EmployeeBo {

	public void calculateIncomeTax(EmployeeVo employee) {
		
		double income=(employee).getAnnualIncome();
		if(income<2500)
			employee.setIncometax(0);
		else if(income<5000)
			employee.setIncometax(0.1*income);
		else
			employee.setIncometax(0.2*income);	
	}
}
