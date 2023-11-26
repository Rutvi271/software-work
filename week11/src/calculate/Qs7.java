package calculate;

import java.util.HashMap;

public class Qs7 {
    public static void main(String[] args) {
        HashMap<String, Integer> sample = new HashMap<>();
        sample.put("hgjh", 2);
        sample.put("Bob", 3);
        sample.put("Chang", 8);
        sample.put("Diana", 5);

        System.out.println("Iterating through the values in the HashMap:");
        for (Integer num : sample.values()) {
            System.out.println("integer " + num);
        }
    }
}
