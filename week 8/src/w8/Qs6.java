package w8;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/
import java.util.Scanner;

public class Qs6 {
    public static void main(String[] args)
    {
        person();
    }

    public static void person()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = input.nextInt();

        System.out.print("Enter Employee Name: ");
        String employeeName = input.next();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        double hra = basicSalary * 0.10;
        double ta = basicSalary * 0.09;
        double da = basicSalary * 0.08;
        double pf = basicSalary * 0.20;

        double grossSalary = basicSalary + hra + ta + da - pf;



        System.out.println("-----------------------------");
        System.out.println("|                             |");
        System.out.println("|       Salary slip           |");
        System.out.println("-----------------------------");
        System.out.println("|                             |");
        System.out.println("|   Employee ID: "+ employeeId+"          |");
        System.out.println("|   Employee name: "+ employeeName+"      |");
        System.out.println("|----------------------------|");
        System.out.println("|                             |");
        System.out.println("|   HRA : "+hra+"                |");
        System.out.println("|   TA : "+ta+"                  |");
        System.out.println("|   DA : "+da+"                  |");
        System.out.println("|   PF : "+pf+"                  |");
        System.out.println("|-----------------------------|");
        System.out.println("|                             |");
        System.out.println("|   GROSS SALARY : "+grossSalary+"    |");

    }
}
