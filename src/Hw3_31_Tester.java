class Hw3_31_Tester {
    public static void main(String[] args) {
        Hw3_31 obj = new Hw3_31();
        int sum = obj.sum1toN(10);
        System.out.println("Sum: " + sum);
        sum = obj.sum1toN(5);
        System.out.println("Sum: " + sum);
        sum = obj.sum1toN(100);
        System.out.println("Sum: " + sum);
        sum = obj.sum1toN(50);
        System.out.println("Sum: " + sum);
    }
}