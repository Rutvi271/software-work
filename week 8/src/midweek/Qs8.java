package midweek;

import java.util.Scanner;

public class Qs8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        int totalClasses = input.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = input.nextInt();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }

    }
}
