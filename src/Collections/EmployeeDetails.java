package Collections;


public class EmployeeDetails {

	String employeeName;
	int employeeId;

	EmployeeDetails(String employeeName, int employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;

	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}
