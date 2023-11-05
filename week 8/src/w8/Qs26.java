package w8;
/*Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd*/
import java.util.Scanner;

public class Qs26 {
    public static void main(String[] args)
    {
        r1();
    }
    public static void r1()
    {
        Scanner new1 = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = new1.nextLine();
        char rev[] = word.toCharArray();
        for (int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }
    }

}
