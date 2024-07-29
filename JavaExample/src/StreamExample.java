import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[]args){

        List<Employee> empList = new ArrayList<>();

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
        empList.add(e1);

        e1 = new Employee();
        e1.setAge(36);
        e1.setEmpName("DDD");
        e1.setSalary(120000);
        e1.setDesignation("Technical Lead");
        empList.add(e1);

        e1 = new Employee();
        e1.setAge(37);
        e1.setEmpName("EEE");
        e1.setSalary(180000);
        e1.setDesignation("Manager");
        empList.add(e1);

       for(Employee e: empList) {
           System.out.println(e.getEmpName());
       }

       Iterator<Employee> it = empList.iterator();
       while(it.hasNext()) {
           System.out.println(it.next().getSalary());
       }

       Stream<Employee> ste = empList.stream();

     // System.out.println(ste.count());
        List<Employee> forEachList = new ArrayList<>();

      System.out.println(ste.distinct().anyMatch(e->e.getAge()==34));
      System.out.println(empList.stream().filter(e->e.getAge()==35).findAny().get().getEmpName());
     List<Employee> ageFilter = empList.stream().filter(e->e.getAge()>33).collect(Collectors.toList());
    List<Employee> filterList =  empList.stream().filter((e)-> (e.getAge()>33 && e.getSalary() >65000)).collect(Collectors.toList());
    empList.forEach((e)->{
            if(e.getSalary() >= 40000) {
                forEachList.add(e);
            }
    });

        System.out.println(forEachList);
     System.out.println(ageFilter);

     System.out.println(filterList);

     List<Integer> numsInt = Arrays.asList(0,1,2,3,4,5);
    int sum =  numsInt.stream().reduce(0, (element1, element2)->element1+element2);
    System.out.println("Sum is::"+sum);

        Map<String, Integer> map = new HashMap<>();
        map.put("Abrar", 30000);
        map.put("Chand", 80000);
        map.put("kalam", 70000);
        map.put("Raheem", 25000);
        map.put("Kiran", 63000);
        map.put("Esa", 45000);

       List<Map.Entry<String, Integer>> mapDetails =
               map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());

       System.out.println(mapDetails.get(1).getKey());

    }


}
