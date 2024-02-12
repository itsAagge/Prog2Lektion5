package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String answer = "";
        answer += s.charAt(s.length() - 1);
        return answer + reverse(s.substring(0,s.length() - 1));
    }
}
