import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilters {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nag","Babu","Gadam","Nag");
        nameList.stream().filter(i-> !i.equalsIgnoreCase("Babu")).collect(Collectors.toSet()).forEach(System.out::println);


        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(3,"nag");
        Employee e2 = new Employee(2,"babu");
        Employee e3 = new Employee(1,"gadam");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList.stream().filter(i->!i.getName().equalsIgnoreCase("nag")).findAny().orElse(null));


        List<String> collect = employeeList.stream().map(Employee::getName).collect(Collectors.toList()); //convert to String

        collect.forEach(System.out::println);

    }
}
