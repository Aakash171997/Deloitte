import reports.Doctor;
import reports.Patient;

public class PrintMessage {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to IDE");
		
		PrintMessage p = new PrintMessage();
		
		p.display();
		p.accept("Anwesh");
		
		Customer customer = new Customer();
		customer.customerDetails();
		
		employee.Employee e = new employee.Employee();
		e.getEmployeeDetails();
		
		Doctor d = new Doctor();
		d.getReport();
		
		Patient patient = new Patient();
		patient.getFees();
	}
	
	public void display() {
		System.out.println("Display Called");
	}
	
	public void accept(String name) {
		System.out.println(name);
	}

}