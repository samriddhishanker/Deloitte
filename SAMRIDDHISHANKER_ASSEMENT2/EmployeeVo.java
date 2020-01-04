package assignment2;

public class EmployeeVo {
	
	private int employeeId;
	private String employeeName;
	private int annualIncome;
	private double incometax;
	
	public EmployeeVo(){
		
	}

	public EmployeeVo(int employeeId, String employeeName, int annualIncome, double incometax) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.annualIncome = annualIncome;
		this.incometax = incometax;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getIncometax() {
		return incometax;
	}

	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annualIncome;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(incometax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (annualIncome != other.annualIncome)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(incometax) != Double.doubleToLongBits(other.incometax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeVo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", annualIncome="
				+ annualIncome + ", incometax=" + incometax + "]";
	}

}