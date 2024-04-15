import java.util.Scanner;

public class Q3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();
        scanner.close();

        if (isValidTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("Invalid Sides!");
        }
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }
}