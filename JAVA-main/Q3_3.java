import java.util.Scanner;

public class Q3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter the source currency (USD, INR, EUR): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency (USD, INR, EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        scanner.close();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        if (convertedAmount != -1) {
            System.out.printf("%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency conversion.");
        }
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double usdToInrRate = 83.11; 
        double usdToEurRate = 0.82; 
        double inrToEurRate = 0.011; 

        
        switch (sourceCurrency) {
            case "USD":
                switch (targetCurrency) {
                    case "USD":
                        return amount;
                    case "INR":
                        return amount * usdToInrRate;
                    case "EUR":
                        return amount * usdToEurRate;
                }
                break;
            case "INR":
                switch (targetCurrency) {
                    case "USD":
                        return amount / usdToInrRate;
                    case "INR":
                        return amount;
                    case "EUR":
                        return amount * inrToEurRate;
                }
                break;
            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        return amount / usdToEurRate;
                    case "INR":
                        return amount / inrToEurRate;
                    case "EUR":
                        return amount;
                }
                break;
        }
        return -1;
    }
}
