package ObjectMethods;

public class Equality {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Anwesh");
		Employee employee2 = new Employee(1, "Anwesh");
		Employee employee3 = employee1;
		
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1 == employee2);
		
		System.out.println(employee1.equals(employee3));
		System.out.println(employee1 == employee3);
		
		String name1 = "Anwesh";
		String name2 = new String("Anwesh");
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());

	}

}
