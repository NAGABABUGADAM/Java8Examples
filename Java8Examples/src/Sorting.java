import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(123, "nag"));
		empList.add(new Employee(533, "gadam"));
		empList.add(new Employee(456, "babu"));
		empList.forEach(emp-> System.out.println(emp));
//		Collections.sort(empList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return o1.getId() - o2.getId();
//			}
//		});
		empList.sort((o1,o2)->o1.getId()-o2.getId());
		
		empList.forEach(emp-> System.out.println(emp));
		
	}

}
