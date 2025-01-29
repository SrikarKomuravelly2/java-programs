package DataStructures;

public class Employee {
	
	private String empName;
	private double empSalary;
	
	public Employee(String empName, double empSalary)
	{
		this.empName=empName;
		this.empSalary=empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	

}
