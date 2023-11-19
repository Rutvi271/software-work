package week924qs;
//QS4
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(1) = " + sumDigits(1));
        System.out.println("sumDigits(321) = " + sumDigits(320));
        System.out.println("sumDigits(-10) = " + sumDigits(-10));
    }

    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}