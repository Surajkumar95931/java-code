package apna_college;

public class pattern_logic {
    public static void main(String[] args) {
        int m=1;
        int row=4;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
