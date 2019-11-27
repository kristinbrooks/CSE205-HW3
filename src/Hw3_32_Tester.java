public class Hw3_32_Tester {
    public static void main(String[] args) {
        Hw3_32 obj = new Hw3_32();
        double powerTotal = obj.power(5, 2);
        System.out.println("Answer: " + powerTotal);
        powerTotal = obj.power(2, 5);
        System.out.println("Answer: " + powerTotal);
        powerTotal = obj.power(3, 3);
        System.out.println("Answer: " + powerTotal);
        powerTotal = obj.power(4.3, 6);
        System.out.println("Answer: " + powerTotal);
        powerTotal = obj.power(1, 100);
        System.out.println("Answer: " + powerTotal);
        powerTotal = obj.power(100, 1);
        System.out.println("Answer: " + powerTotal);

    }
}