package apna_college;

public class TWIN_prime {
    public static void main(String[] args) {
        int range = 50;
        int previousPrime = 2;

        for (int num = 3; num <= range; num++) {
            if (isprime(num)) {
                System.out.println("(" + previousPrime + ", " + num + ")");
                previousPrime = num;
            }
        }
    }

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
