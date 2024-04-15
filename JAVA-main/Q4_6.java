public class Q4_6 {

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = 0;

        for (int num : matrix[0]) {
            magicSum += num;
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != magicSum) {
            return false;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }
        if (secondaryDiagonalSum != magicSum) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        boolean isMagic = isMagicSquare(matrix);
        if (isMagic) {
            System.out.println("The given matrix is a magic square.");
        } else {
            System.out.println("The given matrix is not a magic square.");
        }
    }
}
