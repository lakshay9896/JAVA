public class Q4_2 {

    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int uniqueCount = 1;
        for (int i = 1; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniqueCount++] = arr[i];
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(arr, 0, uniqueArray, 0, uniqueCount);
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 6, 7, 8, 8};
        int[] uniqueArray = removeDuplicates(arr);

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array with duplicates removed: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
