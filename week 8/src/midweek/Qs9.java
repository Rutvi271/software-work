package midweek;
/*Modify the above question to allow student to sit if he/she has medical cause. Ask
        user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
import java.util.Scanner;

public class Qs9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = input.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = input.nextInt();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        System.out.print("Do you have a medical cause? (Y/N): ");
        char hasMedicalCause = input.next().charAt(0);

        if (attendancePercentage >= 75 || hasMedicalCause == 'Y' || hasMedicalCause == 'y') {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam due to low attendance.");
        }


    }
}
