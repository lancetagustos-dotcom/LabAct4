public class Instructor extends Employee{
	private String subject;
	private double hoursPerWeek, daily, weekly, monthly;
  
	public Instructor (String name, String employeeID, String department,  String subject, double ratePerHour, double hoursPerWeek) {
		super(name, employeeID, department, ratePerHour);
		this.subject = subject;
		this.hoursPerWeek = hoursPerWeek;
    
	}
	public String status() {
		if (hoursPerWeek >= 18) {
			return "Full-Time";
		} else {
			return "Part-Time";
		}
	}
  
	public double dailyPay() {
		daily = getRatePerHour() * 8;
		return daily;
	}
  
	public double weeklySalary() {
		weekly = getRatePerHour() * hoursPerWeek;
		return weekly;
	}
  
	public double monthlySalary() {
		monthly = weeklySalary() * 4;
		return monthly;
	}
}
