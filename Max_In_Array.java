package apna_college;

public class Max_In_Array {
    public static void main(String[] args) {
        int harshal[] = {2, 5, 6, 8, 55, 6, 4};
        int sum=Largest(harshal);
        System.out.println(sum);
    }

    static int larg = Integer.MIN_VALUE;

    public static int Largest(int harshal[]) {
        for (int i = 0; i < harshal.length; i++) {
            if (larg < harshal[i]) {
                larg = harshal[i];
            }
        }
        return larg;
    }
}

