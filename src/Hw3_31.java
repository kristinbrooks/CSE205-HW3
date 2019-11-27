// CLASS: Hw3_31
// AUTHOR: Kristin Brooks, krbrook7, krbrook7@asu.edu

public class Hw3_31 {
    public Hw3_31() { }

    /**
     * Calculates the sum of the integers from 1 to the provided integer, n.
     */
    int sum1toN(int n) {
        if (n == 1) {return 1;}
        else {
            int smallerSum = sum1toN(n - 1);
            return smallerSum + n;
        }
    }
}