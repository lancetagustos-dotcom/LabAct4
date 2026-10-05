import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner jw = new Scanner(System.in);
		System.out.println("\nLab Activity #4\n");

		System.out.println("Enter your name: ");
		String name = jw.nextLine();
		System.out.println("Enter your Employee ID: ");
		String employeeID = jw.nextLine();
		System.out.println("Enter your Department: ");
		String department = jw.nextLine();
		System.out.println("Enter your subject: ");
		String subject = jw.nextLine();
		System.out.println("Enter your Rate Per Hour: ");
		double ratePerHour = jw.nextDouble();
		System.out.println("Enter your Hours Per Week: ");
		double hoursPerWeek = jw.nextDouble();

		Instructor instructor = new Instructor(name, employeeID, department, subject, ratePerHour, hoursPerWeek);

		System.out.println("\nINSTRUCTOR INFORMATION");
		System.out.println("Subject: " + subject);
		System.out.println("Rate per Hour: " + ratePerHour);
		System.out.println("Hours per Week: " + hoursPerWeek);

		System.out.println();
    
		System.out.println("PAY INFORMATION");
		System.out.println("Daily: " + instructor.dailyPay());
		System.out.println("Weekly: " + instructor.weeklySalary());
		System.out.println("Monthly: " + instructor.monthlySalary());
    
		System.out.println();
    
		System.out.println("TEACHING STATUS");
		System.out.println("Status: " + instructor.status() + "\n");
	}
}
