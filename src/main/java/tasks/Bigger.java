package tasks;

public class Bigger {
    // the first method with built-in class Math
    public int findBigger(int x,
                          int y) {
        return Math.max(x, y);
    }

    // the second method with a ternary operator
    public int findBigger2(int x,
                           int y) {
        return x > y ? x : y;
    }
}
