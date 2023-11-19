package week924qs;

public class Qus7 {
    public static void main(String[] args) {
        System.out.println("sumFirstAndLastDigit(252): " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257): " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0): " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(-10): " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
