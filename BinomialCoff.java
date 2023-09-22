package apna_college;

public class BinomialCoff {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bio(int n,int r){
        n=fact(n);
        r=fact(n);
       int  nmr=fact(n-r);
       int bio=n/(r*nmr);
       return bio;

    }
    public static void main(String[] args) {
        System.out.println(bio(5,2));
    }
}
