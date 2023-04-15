
public class EmpDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee(2010, 45, "Ahmet", 5000);
		System.out.println(e1.bonus()+" bonus durumu");
		System.out.println(e1.tax()+" tax durumu");
		System.out.println(e1.increase()+" artış durumu");
		System.out.println(e1.salary-e1.tax() + " vergi sonrası maaş");
		

	}

}
