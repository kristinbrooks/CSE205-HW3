// CLASS: Hw3_34
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

import static java.lang.Math.pow;

public class Hw3_34 {
    private int calls = 0;
    private int callsFaster = 0;

    /**
     * Default constructor
     */
    Hw3_34() {}

    /**
     * Calculates x to the nth power.
     */
    private double power(double x, int n) {
        calls += 1;
        if (n == 0) {return 1;}
        else {
            double smallerPower = power(x, n -1);
            return x * smallerPower;
        }
    }

    /**
     * Calculates x to the nth power.
     */
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    private double powerFaster(double x, int n) {
        callsFaster += 1;
        if (n % 2 != 0) {
            if (n == 1) {return x;}
            else {
                double smallerPower = powerFaster(x, n-1);
                return x *smallerPower;
            }
        } else {
            return pow(pow(x, n / 2), 2);
        }
    }

    /**
     * main()
     */
    public void main(String[] args) {
        for (int x = 1; x <= 3; x++) {
            for (int n = 0; n <= 10; n++) {
                System.out.println(x + " to the power of " + n + ":");
                System.out.println("\t" + power(x, n) + "\n\tcalls: " + calls);
                System.out.println("\t" + powerFaster(x, n) + "\n\tcallsFaster: " + callsFaster);
            }
        }
    }
}