public class MethOverloading {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        double sum2 = add(5.5, 10.5);
        String sum3 = add("Hello, ", "World!");

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated strings: " + sum3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
    
}
