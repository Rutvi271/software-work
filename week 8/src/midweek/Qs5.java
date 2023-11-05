package midweek;

import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class Qs5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2)
        {
            System.out.println("The greatest number is: " + num1);
        }
        else if (num2 > num1)
        {
            System.out.println("The greatest number is: " + num2);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}
