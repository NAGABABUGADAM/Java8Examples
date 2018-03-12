import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {

        List<String> friuts = Arrays.asList("apple", "apple", "apple", "banana", "banana", "grape", "grape");
        Map<String, Long> fruitMap = friuts.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("fruitMap " + fruitMap);


        Employee e1 = new Employee(1, "nag");
        Employee e2 = new Employee(1, "babu");
        Employee e3 = new Employee(2, "gadam");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Map<Integer, List<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getId));

        System.out.println("empMap "+empMap);

        empMap.forEach((k,v)-> System.out.println("key"+k+"value"+v));

        EmployeeT et1 = new EmployeeT(1, "nag","nag1");
        EmployeeT et2 = new EmployeeT(2, "babu","babu1");
        EmployeeT et3 = new EmployeeT(3, "gadam","gadam1");
        List<EmployeeT> employeeTList = new ArrayList<EmployeeT>();
        employeeTList.add(et1);
        employeeTList.add(et2);
        employeeTList.add(et3);
        employeeTList.stream().collect(Collectors.toMap(EmployeeT::getNbr,EmployeeT::getName));
        System.out.println("employeeTList "+employeeTList);






    }
}
