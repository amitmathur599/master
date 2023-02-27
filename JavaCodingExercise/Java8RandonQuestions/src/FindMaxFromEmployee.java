import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxFromEmployee {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
	    
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

		Optional<Employee> emp = employeeList.stream()
		        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		System.out.println(emp);
		System.out.println("---------------------------------------");
		
		List<Employee> sortedList = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedList.get(0));
	}
	


}
