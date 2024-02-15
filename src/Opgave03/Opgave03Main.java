package Opgave03;

public class Opgave03Main {
    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        if (p % 2 == 0) {
            return power(n * n, p / 2);
        } else {
            return power(n, p - 1) * n;
        }
    }
}
