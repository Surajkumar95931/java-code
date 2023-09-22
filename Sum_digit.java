package apna_college;

public class Sum_digit {
    public static void main(String[] args) {
        int number = 123545;
        System.out.println(sumDigit(number));
    }

    public static int sumDigit(int number) {
        int sum = 0;
        while (number != 0) {
            int last=number%10;//Find the last digit of the number
            sum=sum+last;//Add the last digit to the sum
            number=number/10;//Remove the last digit from the number
        }
        return sum;
    }
}
