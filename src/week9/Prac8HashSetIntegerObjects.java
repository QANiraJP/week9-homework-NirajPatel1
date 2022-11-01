package week9;

import java.util.HashSet;
import java.util.Set;

public class Prac8HashSetIntegerObjects {

    public static void main(String[] args) {
        Prac8HashSetIntegerObjects obj = new Prac8HashSetIntegerObjects();
        obj.hasSet();
    }

    public void hasSet(){
        Set<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);

        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}
