package w8;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3and 5 separately.
public class Qs14 {
    public static void main(String[] args)
    {
        d();
    }
    public static void d(){
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
