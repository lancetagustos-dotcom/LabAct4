public class Employee {
	private String name, employeeID, department;
	private double ratePerHour;

	public Employee(String name, String employeeID, String department,  double ratePerHour) {
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.ratePerHour = ratePerHour;
	};

	public void employeeInfo() {
		System.out.println("EMPLOYEE INFORMATION");
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
	}
  //getter for private rPH
	public double getRatePerHour() {
    		return ratePerHour;
	}
}
