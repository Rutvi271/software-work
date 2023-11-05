package w8;

import java.util.Scanner;

//Write a Java program to sum values of an array.
public class Qs21 {
    public static void main(String[] args)
    {
        ar1();
    }
    public static void ar1()
    {
        Scanner new1 =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n1=new1.nextInt();

        int[] array = new int[n1];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n1; i++)
        {
            array[i]=new1.nextInt();
        }

        int sum=0;
        for (int i=0; i<array.length; i++)
        {
            sum= sum+array[i];
        }
        System.out.println("The sum is "+sum);
    }
}
