package w8;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
        fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
        < 10,000 2%*/
import java.util.Scanner;

public class Qs10 {
    public static void main(String[] args)
    {
sale();
    }
    public static void sale()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int salesId = input.nextInt();

        System.out.print("Enter Seller's Name: ");
        String sellerName = input.next();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = input.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        double commissionRate;

        if (salesAmount >= 50000)
        {
            commissionRate = 0.35;
        }
        else if (salesAmount >= 30000)
        {
            commissionRate = 0.20;
        }
        else if (salesAmount >= 20000)
        {
            commissionRate = 0.10;
        }
        else if (salesAmount >= 10000)
        {
            commissionRate = 0.05;
        }
        else
        {
            commissionRate = 0.02;
        }


        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + commissionRate);

    }
}
