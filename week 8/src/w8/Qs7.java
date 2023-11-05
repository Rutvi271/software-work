package w8;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even.
public class Qs7 {
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
