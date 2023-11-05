package w8;
/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
        find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
import java.util.Scanner;

public class Qs13 {
    public static void main(String[] args)
    {
        cal();
    }
    public static void cal()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the mathematical operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        if (operator == '+')
        {
            result = num1 + num2;
            System.out.println("The sum is "+result);
        }
        else if (operator == '-')
        {
            result = num1 - num2;
            System.out.println("The substraction is "+result);
        }
        else if (operator == '*')
        {
            result = num1 * num2;
            System.out.println("The multiplication is "+result);
        }
        else if (operator == '/')
        {

            result = num1 / num2;
            System.out.println("The division is "+result);
        }
        else
        {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            return;
        }
    }
}
