package apna_college;

public class OOps {
    static class Student {
        String name = "suraj";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("suraj");
        System.out.println(s1.getName());
    }

}
