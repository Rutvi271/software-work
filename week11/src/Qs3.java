import java.util.ArrayList;

public class Qs3 {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("White");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Red");
        colorsList.add("Orange");
        System.out.println("Colors in the collection:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}