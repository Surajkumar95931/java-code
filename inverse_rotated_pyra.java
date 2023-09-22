package apna_college;

public class inverse_rotated_pyra {
    public static void pyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void half_with_num(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }


    public static void main(String[] args) {
       // pyr(5);
        //half_with_num(5);
        butterfly(4);
    }
}
