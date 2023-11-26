package calculate;

import java.util.Arrays;

public class Qs10 {
    public static void main(String[] args) {
        String[] groupMembers = {"Rutvi", "Kinnari", "Hitesh", "Alka", "Rushit", "Akash", "Jay"};

        System.out.println("Group Members:" + Arrays.toString(groupMembers));
        for (String memberName : groupMembers) {
            if (memberName.equals("Rutvi")) {
                System.out.println("Hello, " + memberName + "! This is your name.");
            }
        }
    }
}

