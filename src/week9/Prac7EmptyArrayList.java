package week9;

import java.util.ArrayList;

public class Prac7EmptyArrayList {

    public static void main(String[] args) {
        Prac7EmptyArrayList obj = new Prac7EmptyArrayList();
        obj.emptyArrayList();
    }

    public void emptyArrayList() {
        ArrayList<String> tube = new ArrayList();

        tube.add("Central");
        tube.add("Victoria");
        tube.add("Jubilee");
        tube.add("Circle");
        tube.add("Hammersmith and City");
        tube.add("Bakerloo");

        System.out.println(tube.isEmpty());

//        ArrayList<String> station = new ArrayList<>();    // For Reference
//        System.out.println(station.isEmpty());
    }
}
