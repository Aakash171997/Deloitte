package cust;

public class CustomerApp {

	public static void main(String[] args) {
		/*Customer customer1 = new Customer(1, "Anwesh", "Bengaluru", 500.00);
		Customer customer2 = new Customer(2, "Anjan", "Bengaluru", 800.00);
		
		System.out.println(customer1.equals(customer1));
		System.out.println(customer1.equals(customer2));
		
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		
		customer1.setBillAmount(700.00);
		
		System.out.println(customer1.toString());
		System.out.println("Cust 1 bill: "+customer1.getBillAmount());*/
		
		Customer customer[] = new Customer[5];
		
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
		}
		
		customer[0].setCustName("Yama");
		
		System.out.println(customer[0].getCustName());
	}

}
