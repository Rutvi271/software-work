package week924qs;

public class Qus9 {
    public static void main(String[] args) {
        int n = 8;

        int firstTerm = 1;
        int secondTerm = 1;
        int nextTerm;

        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}