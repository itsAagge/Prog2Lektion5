package Opgave05;

public class Opgave05Main {
    public static int sfd(int a, int b) {
        if (b <= a && a % b == 0) {
            return b;
        }
        if (a < b) {
            return sfd(b, a);
        } else {
            return sfd(b, a % b);
        }
    }
}
