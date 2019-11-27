// CLASS: Hw3_33
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

import static java.lang.Math.pow;

public class Hw3_33 {
    /**
     * Default constructor
     */
    public Hw3_33() {}

    /**
     * Calculates x to the nth power.
     */@SuppressWarnings("IntegerDivisionInFloatingPointContext")
    private static double powerFaster(double x, int n) {
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
    public static void main(String[] args) {
        Hw3_32 obj = new Hw3_32();
        for (int x = 1; x <= 3; x++) {
            for (int n = 0; n <= 10; n++) {
                System.out.println(x + " to the power of " + n + ": " + obj.power(x, n) + ", "
                        + powerFaster(x, n));
            }
        }
    }
}