package midweek;

import java.util.Scanner;

//Write a program to print a string entered by user.
public class Qs11
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        System.out.println("You entered: " + userString);
    }
    }
