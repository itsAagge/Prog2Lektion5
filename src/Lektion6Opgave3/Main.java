package Lektion6Opgave3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(doesArrayContainNumber(ints, 7));
        System.out.println(doesArrayContainNumber(ints, 12));
    }

    public static boolean doesArrayContainNumber(ArrayList<Integer> list, int i) {
        return hjælpemetode(list, i, 0, list.size() - 1);
    }

    public static boolean hjælpemetode(ArrayList<Integer> list, int i, int left, int right) {
            int middle = left + (right - left) / 2;
            int k = list.get(middle);
            if (k == i)
                return true;
            if (left >= right) {
                return false;
            }

            if (k > i) {
                right = middle - 1;
                return hjælpemetode(list, i, left, right);
            } else {
                left = middle + 1;
                return hjælpemetode(list, i, left, right);
            }
    }
}
