package algorithm.sorting;

public class RadixSort {
    public static void main(String[] args) {
        int[] myArray = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.print("Original array: ");
        for(int val : myArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[][] radixArray = new int[10][myArray.length];
        int[] counts = new int[10];
        int maxVal = findMax(myArray);
        int exp = 1;

        while (maxVal / exp > 0) {
            for(int val : myArray) {
                int radixIndex = (val / exp) % 10;
                radixArray[radixIndex][counts[radixIndex]] = val;
                counts[radixIndex]++;
            }

            int pos = 0;
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < counts[i]; j++) {
                    myArray[pos] = radixArray[i][j];
                    pos++;
                }
                counts[i] = 0;
            }

            exp *= 10;
        }

        System.out.print("Sorted array: ");
        for(int val : myArray) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int val : arr) {
            if(val > max) {
                max = val;
            }
        }
        return max;
    }
}
