import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) throws Exception {

		Employee e1 = new Employee(1, "nag");
		Employee e2 = new Employee(2, "babu");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		List<Employee> bigList = new ArrayList<>();
		List<Integer> nbrs = Arrays.asList(41, 42, 43);
		empList.forEach(a -> System.out.println("empList" + a.toString()));
		// List<Employee> tlist = new ArrayList<>(empList);
		List<Employee> tlist = new ArrayList<>();
		for (Employee e : empList) {
			tlist.add(e.clone());
		}
		for (Integer n : nbrs) {
			for (Employee e : tlist) {
				e.setId(n);
				e.setName("prasad");
			}
			// bigList.addAll(tlist);
			for (Employee e : tlist) {
				bigList.add(e.clone());
			}
			tlist.forEach(e -> System.out.println("tlist for element" + n + " is " + e.toString()));
			empList.forEach(a -> System.out.println("empList" + a.toString()));
		}
		bigList.forEach(e -> System.out.println("BigList for element is " + e.toString()));

	}

}
