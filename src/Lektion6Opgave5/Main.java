package Lektion6Opgave5;

public class Main {
    public static void main(String[] args) {
        System.out.println(binomial(1, 1) + " skal være 1");
        System.out.println(binomial(4, 1) + " skal være 4");
        System.out.println(binomial(6, 3) + " skal være 20");
    }

    public static int binomial(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        } else {
            return binomial(n - 1, m) + binomial(n - 1, m - 1);
        }
    }
}
