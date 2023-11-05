package midweek;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among them.
public class Qs7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age of person 1: ");
        int age1 = input.nextInt();

        System.out.print("Enter the age of person 2: ");
        int age2 = input.nextInt();

        System.out.print("Enter the age of person 3: ");
        int age3 = input.nextInt();

        int oldest = Math.max(Math.max(age1, age2), age3);
        int youngest = Math.min(Math.min(age1, age2), age3);

        System.out.println("Oldest person is " + oldest + " years old.");
        System.out.println("Youngest person is " + youngest + " years old.");


    }
}
