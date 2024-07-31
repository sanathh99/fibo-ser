public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
