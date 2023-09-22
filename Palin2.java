package apna_college;

public class Palin2 {
    public static void main(String[] args) {
        int number=121;
        System.out.println(palind(number));
    }
    public static boolean palind(int number){
        int palindrome=number;
        int reverse=0;
        while (palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome/=10;

        }
        return number==reverse;
    }
}
