package main.java;

public class Rechner {

    public int plus(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int minus(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public int mal(int faktor1, int faktor2) {
        return faktor1 * faktor2;
    }

    public double geteilt(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor darf nicht 0 sein!");
        }
        return (double) dividend / divisor;
    }

    public int ultimativeAntwort(String frage) {
        return 42;
    }
}
