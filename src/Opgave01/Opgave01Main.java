package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        if (n == 1) { //0! = 1 og 1! = 1, så vi kan lige så godt lave et kald mindre ved at stoppe en gang før
            return 1;
        }
        return n * factorial(n - 1);
    }
}
