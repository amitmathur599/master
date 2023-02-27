
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		List<Employee> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Employee developer : listDevs) {
			System.out.println(developer);
		}
		
		//sort by age
		Collections.sort(listDevs, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});
	
		System.out.println("After Sort");
		for (Employee developer : listDevs) {
			System.out.println(developer);
		}
		
	}

	private static List<Employee> getDevelopers() {

		List<Employee> result = new ArrayList<Employee>();

		result.add(new Employee(4000, "mkyong"));
		result.add(new Employee(3000,"alvin"));
		result.add(new Employee( 2000, "jason"));
		result.add(new Employee( 1000, "iris"));
		
		return result;

	}
	
}