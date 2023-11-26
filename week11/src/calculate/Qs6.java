package calculate;

import java.util.HashSet;

public class Qs6 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();

        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println("Numbers between 1 and 10 present in the set:");
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is present in the set.");
            } else {
                System.out.println(i + " is NOT present in the set.");
            }
        }
    }
}
