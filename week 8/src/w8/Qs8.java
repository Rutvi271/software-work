package w8;

import java.util.Scanner;

//Write a java program to get numbers from users and print whether it is positive or negative.
public class Qs8 {
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = new1.nextInt();
        if(n1<0)
            System.out.println("The number is negative");
        else if(n1>0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is zero");
    }
}
