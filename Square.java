package apna_college;

public class Square {
    public static void main(String[] args) {
        sq s=new sq();
        //s.area(5);//////
        System.out.println("your area is "+s.area(5));
    }
    static class sq{
        public int area(int a){
            return a*a;
        }

    }
}
