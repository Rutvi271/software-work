package w8;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
public class Qs19 {
    public static void main(String[] args)
    {
        num();
    }
    public static void num()
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
