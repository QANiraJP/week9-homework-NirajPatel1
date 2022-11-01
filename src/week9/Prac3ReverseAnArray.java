package week9;

import java.util.Arrays;

public class Prac3ReverseAnArray {
    public static void main(String[] args) {
        Prac3ReverseAnArray obj = new Prac3ReverseAnArray();
        obj.reverseArray();
    }

    public void reverseArray() {
        int[] aray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] revArr = new int[aray.length];

        for (int i = aray.length - 1; i >= 0; i--) {
            revArr[aray.length - i - 1] = aray[i];
        }
        System.out.println("Original Array is " + Arrays.toString(aray));
        System.out.println("Reversed Array is " + Arrays.toString(revArr));
    }
}
