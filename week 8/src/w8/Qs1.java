package w8;

//Write a java program that tells us that Input number is odd or even? HINT: use ternary operator (? :)
import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args)
    {
        w1();
    }

    public static void w1()
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = a.nextInt();

        String result = (x%2==0)?"even":"odd";
        System.out.print(result);

    }
}
