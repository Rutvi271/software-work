package midweek;
//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class Qs10 {
    public static void main(String[] args)
    {
        sum();
    }
    public static void sum()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int total=num2+num1;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + total);

    }

}
