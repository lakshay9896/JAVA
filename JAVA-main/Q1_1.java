public class Q1_1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        System.out.println("Using For Loop:-");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nUsing While Loop:-");
        int num = 2;
        while (num <= 100) {
            boolean isPrime = true;
            int divisor = 2;
            while (divisor < num) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
