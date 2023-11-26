package calculate;

import java.util.ArrayList;
import java.util.Iterator;

public class Qs4 {
    public static void main(String[] args){
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Red");
        colorsList.add("Orange");
        Iterator<String> iterator = colorsList.iterator();

        System.out.println("Iterating through the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
