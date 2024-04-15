public class Q4_1 {

    public static int[] rotateLeft(int[] arr, int positions) {
        int length = arr.length;
        int[] rotatedArray = new int[length];
        
        positions = positions % length;
        
        for (int i = 0; i < length; i++) {
            rotatedArray[(i + length - positions) % length] = arr[i];
        }
        
        return rotatedArray;
    }
    
    public static int[] rotateRight(int[] arr, int positions) {
        int length = arr.length;
        int[] rotatedArray = new int[length];
        
        positions = length - (positions % length);
        
        for (int i = 0; i < length; i++) {
            rotatedArray[(i + positions) % length] = arr[i];
        }
        
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positions = 2;

        int[] rotatedLeft = rotateLeft(arr, positions);
        System.out.print("Rotated array to the left: ");
        for (int num : rotatedLeft) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] rotatedRight = rotateRight(arr, positions);
        System.out.print("Rotated array to the right: ");
        for (int num : rotatedRight) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
