package week924qs;

public class Qus14 {
    public static void main(String[] args) {

        int m = 1;
        int n;
        int number = 0;

        while (m <= number) {
            n = 1;
            while (n++ <= number - m) {

                System.out.print(" ");
            }

            n = 1;

            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }

            System.out.println();

            m++;
        }
        m = number - 1;


    }
}

///Tried but not getting