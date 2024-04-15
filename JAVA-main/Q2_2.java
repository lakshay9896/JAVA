public class Q2_2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid Arguments!");
            return;
        }

        int length = Integer.parseInt(args[0]);
        String charset = args[1];

        String generatedPassword = "";
        for (int i = 0; i < length; i++) {
            char randomChar = getRandomChar(charset);
            generatedPassword += randomChar;
        }

        System.out.println("Generated password: " + generatedPassword);
    }

    private static char getRandomChar(String charset) {
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[{]}|;:',<.>/?";

        String selectedCharset = "";
        if (charset.contains("upper")) {
            selectedCharset += upperChars;
        }
        if (charset.contains("lower")) {
            selectedCharset += lowerChars;
        }
        if (charset.contains("numbers")) {
            selectedCharset += numberChars;
        }
        if (charset.contains("special")) {
            selectedCharset += specialChars;
        }

        int randomIndex = (int) (Math.random() * selectedCharset.length());
        return selectedCharset.charAt(randomIndex);
    }
}
