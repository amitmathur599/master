import java.util.Map.Entry;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1009, "Sam", 90000.00, "sam@infotech.com");
		Employee1 e2 = new Employee1(2009, "Ambay", 30000.00, "martin@infotech.com");
		Employee1 e3 = new Employee1(3009, "Joya", 50000.00, "joya@infotech.com");
		Employee1 e4 = new Employee1(4009, "Boya", 70000.00, "harry@infotech.com");
		Employee1 e5 = new Employee1(5009, "Sean", 80000.00, "sean@infotech.com");
		
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		 LRUCache<Employee1, Department> cache = LRUCache.newInstance(3);
		
		 cache.put(e1, d1);
		 cache.put(e2, d1);
		 cache.put(e3, d1);
		
		 cache.put(e4, d2);
		 cache.put(e5, d2);
		
		Set<Entry<Employee1, Department>> entrySet = cache.entrySet();
		for (Entry<Employee1, Department> entry : entrySet) {
			Employee1 employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
		}
	}
}