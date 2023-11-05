package midweek;
//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;

public class Qs4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        if (length == breadth)
        {
            System.out.println("It's a square.");
        }
        else
        {
            System.out.println("It's a rectangle.");
        }
    }
    }
