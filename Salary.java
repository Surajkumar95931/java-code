package apna_college;

public class Salary {
    public static void main(String[] args) {
        Employee hars=new Employee();
        hars.setSalary(20000);
        int a= hars.getSalary();
        System.out.println("your salary is "+a);
        hars.setName("harshal");
        String b= hars.getName();
        System.out.println("your name is "+b);
    }
    static class Employee{
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
