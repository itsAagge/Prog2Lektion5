package Lektion6Opgave1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Test af brug af hjælpemetode: " + ligeTalMedHjælpemetode(ints));
        System.out.println("Antallet af lige tal i listen er: " + ligeTal(ints));
    }

    public static int ligeTal(ArrayList<Integer> list) {
        int tempresult;
        int count = 0;
        if (list.isEmpty()) {
            return 0;
        } else {
            tempresult = list.get(0);
            list.remove(0);
            if (tempresult % 2 == 0) {
                count++;
            }
            return count + ligeTal(list);
        }
    }

    public static int ligeTalMedHjælpemetode(ArrayList<Integer> list) {
        return hjælpemetode(list, 0);
    }

    public static int hjælpemetode(ArrayList<Integer> list, int index) {
        int count = 0;
            if (list.get(index) % 2 == 0) {
                count++;
            }
            if (index + 1 < list.size()) {
                return count + hjælpemetode(list, index + 1);
            } else {
                return count;
        }
    }
}
