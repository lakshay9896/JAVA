import java.util.Scanner;

public class Q3_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();

        calculateGradeWithIfElse(score);
        calculateGradeWithSwitchCase(score);
    }

    private static void calculateGradeWithIfElse(int score) {
        System.out.print("Grade (if-else): ");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("Invalid score!");
        }
    }

    private static void calculateGradeWithSwitchCase(int score) {
        System.out.print("Grade (switch-case): ");
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
