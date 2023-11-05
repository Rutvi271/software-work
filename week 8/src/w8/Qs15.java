package w8;
//Write a program that tells us input value is number or an alphabet orsymbol.
import java.util.Scanner;

public class Qs15 {
    public static void main(String[] args)
    {
        num();
    }
    public static void num()
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter element: ");
        char in = x.next().charAt(0);

        if (Character.isDigit(in)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(in)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }
    }
}
