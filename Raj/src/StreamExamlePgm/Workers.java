package StreamExamlePgm;

public class Workers {
private int empId;
private String empName;
private int deptId;
private String status="active";
private double salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Workers(int empId, String empName, int deptId, String status, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.deptId = deptId;
	this.status = status;
	this.salary = salary;
}
@Override
public String toString() {
	return "Workers [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
			+ ", salary=" + salary + "]";
}


}
