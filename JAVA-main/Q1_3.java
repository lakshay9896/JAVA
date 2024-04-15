//Rescursion takes more memory and time than for loop due to overhead of recursive function calls
public class Q1_3 {
    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
}

    public static int fact(int n) {
        if (n == 2) {
            return 2;
        } else {
            return n * fact(n - 1);
        }
    }
}
