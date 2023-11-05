package w8;
//Same as above program-8 using switch statement.
import java.util.Scanner;

public class Qs12 {
    public static void main(String[] args)
    {
        cas();
    }

    public static void cas()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int cs;

        if (number > 0)
        {
            cs = 1;
        }
        else if (number < 0)
        {
            cs = -1;
        }
        else
        {
            cs = 0;
        }

        switch (cs) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
        }


    }
}
