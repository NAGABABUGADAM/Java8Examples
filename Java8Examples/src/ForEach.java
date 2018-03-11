import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

    public  static void main(String a[]){

        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Nag");
        employeeMap.put(2,"Babu");
//        for(Map.Entry<Integer,String> entry :employeeMap.entrySet()){
//
//            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());;
//
//        }

        employeeMap.forEach((k,v)-> System.out.println("key "+k+" Value "+v));
        List<Integer> tempList = new ArrayList<>();
        tempList.add(533);
        tempList.add(123);
        tempList.forEach(System.out::println);

        tempList.stream().filter(i->i.equals(123)).forEach(p-> System.out.println("Value "+p));

    }
}


