package midweek;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the screen.
public class Qs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();
            total = total + num;
        }

        double average = (double) total / 10;

        System.out.println("Average of the 10 integers is: " + average);
    }
}
