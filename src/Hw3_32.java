// CLASS: Hw3_32
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

class Hw3_32 {
    /**
     * Default constructor
     */
    Hw3_32() {}

    /**
     * Calculates x to the nth power.
     */
    double power(double x, int n) {
        if (n == 0) {return 1;}
        else {
            double smallerPower = power(x, n -1);
            return x * smallerPower;
        }
    }
}