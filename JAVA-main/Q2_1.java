public class Q2_1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid Arguments!");
            return;
        }

        double operand1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double operand2 = Double.parseDouble(args[2]);

        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "X":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Arguments!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
