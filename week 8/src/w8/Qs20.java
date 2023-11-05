package w8;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to sort a numeric array and a string array.
public class Qs20 {
    public static void main(String[] args)
    {
        sor();
    }
    public static void sor() {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the number of integer you want to store: ");
        int n1 = new1.nextInt();
        int[] array = new int[n1];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n1; i++)
        {
            array[i] = new1.nextInt();
        }
        System.out.println("the sorted numbers are");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println("Enter the number of string you want to store: ");
        int n2 = new1.nextInt();
        String[] array2 = new String[n2];
        System.out.println("Enter the elements of the array: ");
        for (int j = 0; j < n2; j++)
        {
            array2[j] = new1.next();
        }
        System.out.println("the sorted string is");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
    }
