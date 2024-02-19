package Lektion6Opgave2;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("abba"));
        System.out.println(palindrom("a"));
        System.out.println(palindrom(""));
    }

    public static boolean palindrom(String tekst) {
        if (tekst.isEmpty()) {
            return true;
        }
        return tekst.equals(reverseWithoutSubstrings(tekst, tekst.length()));
    }

    public static String reverseWithoutSubstrings(String str, int index) {
        String reversed = "";
        reversed += str.charAt(index - 1);
        if (index - 2 >= 0) {
            return reversed + reverseWithoutSubstrings(str, index - 1);
        }
        return reversed;
    }
}
