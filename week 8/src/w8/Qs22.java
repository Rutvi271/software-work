package w8;

import java.util.Scanner;

//Write a Java program to calculate the average value of array elements.
public class Qs22 {
    public static void main(String[] args)
    {
        arr();
    }
    public static void arr()
    {
        Scanner new2 =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n2=new2.nextInt();

        int[] array = new int[n2];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n2; i++)
        {
            array[i]=new2.nextInt();
        }

        int sum=0;
        for (int i=0; i<array.length; i++)
        {
            sum= sum+array[i];
        }
        int avg= sum/n2;
        System.out.println("The average is "+avg);
    }
}

