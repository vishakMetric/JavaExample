public class Employee {

    private String empName;
    private int age;
    private float salary;
    private String designation;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(this.getEmpName()).append(":").append(this.getAge()).append("]");
        return sb.toString();
    }
}
