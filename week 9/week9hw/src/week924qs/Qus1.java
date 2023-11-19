package week924qs;

import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");

            if (scan1.hasNextInt()) {
                int number = scan1.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                scan1.next();
            }
        }

        System.out.println("Sum of the numbers: " + sum);
        scan1.close();
    }
}
