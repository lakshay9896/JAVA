import java.util.Scanner;
public class Q1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();
        System.out.print("Prime factors of " + number + " are: ");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}
