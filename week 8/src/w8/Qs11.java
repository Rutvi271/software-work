package w8;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
        other alphabet should be invalid entry.*/
import java.util.Scanner;

public class Qs11 {
    public static void main(String[] args)
    {
      city();
    }
    public static void city()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = input.next().charAt(0);

        String cityName;

        if (alphabet == 'A') {
            cityName = "Ahemdabad";
        } else if (alphabet == 'B') {
            cityName = "Boston";
        } else if (alphabet == 'C') {
            cityName = "Chicago";
        } else if (alphabet == 'D') {
            cityName = "Denver";
        } else if (alphabet == 'E') {
            cityName = "Eereg";
        } else if (alphabet == 'F') {
            cityName = "Fresno";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City name: " + cityName);

        input.close();
    }
}
