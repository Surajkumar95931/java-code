package apna_college;

public class Swap {
    public static void swap(int a,int b){
        int temp= a;
        a= b;
        b= temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int x=10;
        int y=6;
        swap(x,y);
    }
}
