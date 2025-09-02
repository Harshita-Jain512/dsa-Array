import java.util.Arrays;

public class nextPermutation {

    public static void findNextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;

        // Step 1: Find first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If not found, it's the last permutation
        if (ind == -1) {
            reverseArray(arr, 0, n - 1);
        } else {
            // Step 3: Find element just greater than arr[ind]
            for (int i = n - 1; i > ind; i--) {
                if (arr[i] > arr[ind]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;
                    break;
                }
            }

            // Step 4: Reverse from ind + 1 to end
            reverseArray(arr, ind + 1, n - 1);
        }

        // Print result
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1}; // Last permutation
        findNextPermutation(arr);

        int[] arr2 = {1, 2, 3}; // First permutation
        findNextPermutation(arr2);

        int[] arr3 = {1, 3, 2}; // Random case
        findNextPermutation(arr3);
    }
}
