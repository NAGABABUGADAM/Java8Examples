//import java.awt.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Maps {
//
//    public static void main(String[] args) {
//
//        List<String> empList = Arrays.asList("Nag", "babu", "Gadam");
//        List<String> newList = empList.stream().map(String::toUpperCase).collect(Collectors.toList());
//        empList.forEach(System.out::print);
//        newList.forEach(System.out::print);
//
//
//        Employee e1 = new Employee(1, "nag");
//        Employee e2 = new Employee(2, "babu");
//        List<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//
//        List<EmployeeT> employeeTList =
//                employeeList.stream().map(e -> {
//                    EmployeeT ET = new EmployeeT();
//                    ET.setNbr(e.getId());
//                    ET.setName(e.getName());
//                    ET.setText("Hi Employee" + e.getId());
//                    return ET;
//                }).collect(Collectors.toList());
//        employeeTList.forEach(System.out::println);
//
//    }
//}
//
