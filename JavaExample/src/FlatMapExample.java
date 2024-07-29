import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FlatMapExample {

    public static void main(String[]args) {
        List<Integer> primeNumbers = Arrays.asList(5,7,11,13);
        List<Integer> oddNumbers = Arrays.asList(1,3,5);
        List<Integer> evenNumbers = Arrays.asList(2,4,6,8);

       List<List<Integer>> allNumbers =  Arrays.asList(primeNumbers,oddNumbers,evenNumbers);
       System.out.println(allNumbers);

       List<Integer> mapNumbers =  allNumbers.stream().flatMap(list->list.stream()).collect(Collectors.toList());

       System.out.println(mapNumbers);

        List<Employee> empList = new ArrayList<>();
        List<Employee> leadList = new ArrayList<>();
        List<Employee> managerList = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setAge(33);
        e1.setEmpName("AAA");
        e1.setSalary(20000);
        e1.setDesignation("Software Engineer");
        empList.add(e1);

        e1 = new Employee();
        e1.setAge(34);
        e1.setEmpName("BBB");
        e1.setSalary(40000);
        e1.setDesignation("Senior Software Engineer");
        empList.add(e1);

        e1 = new Employee();
        e1.setAge(35);
        e1.setEmpName("CCC");
        e1.setSalary(60000);
        e1.setDesignation("Technical Lead");
        leadList.add(e1);

        e1 = new Employee();
        e1.setAge(36);
        e1.setEmpName("DDD");
        e1.setSalary(120000);
        e1.setDesignation("Technical Lead");
        leadList.add(e1);

        e1 = new Employee();
        e1.setAge(37);
        e1.setEmpName("EEE");
        e1.setSalary(180000);
        e1.setDesignation("Manager");
        managerList.add(e1);

        e1 = new Employee();
        e1.setAge(38);
        e1.setEmpName("FFFF");
        e1.setSalary(200000);
        e1.setDesignation("Senior Manager");
        managerList.add(e1);

        e1 = new Employee();
        e1.setAge(39);
        e1.setEmpName("GGGG");
        e1.setSalary(220000);
        e1.setDesignation("Associate Senior Manager");
        managerList.add(e1);

        List<List<Employee>> empFinalList = Arrays.asList(empList, leadList, managerList);
        System.out.println(empFinalList);

        List<Employee> finalList = empFinalList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(finalList);

        List<String> s = new ArrayList<>();
        s.add("abc");
        List<String> s1 =  s.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(s1);





    }
}
