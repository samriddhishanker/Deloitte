package assignment2;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		int employeeIncome1=(int)o1.getIncometax();
		int employeeIncome2=(int)o2.getIncometax();
		int sort= employeeIncome2 - employeeIncome1;
		if(sort > 0) 
			return 1;
		else if(sort == 0) 
			return 0;
		else if(sort < 0) 
			return -1;
		return 0;
	}
	
}
