package midweek;
//Print multiplication table of 24, 50 and 29 using loop.
public class Qs2 {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 50;
        int number3 = 29;

        System.out.println("Multiplication Table of 24:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number1 + " x " + i + " = " + (number1 * i));
        }

        System.out.println("Multiplication Table of 50:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number2 + " x " + i + " = " + (number2 * i));
        }

        System.out.println("Multiplication Table of 29:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number3 + " x " + i + " = " + (number3 * i));
        }
    }
}






