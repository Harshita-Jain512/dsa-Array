import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithSumEqualK_optimal {
    private static void countSubarray(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int count = 0;

    // Initialize map with sum 0 having frequency 1
    map.put(0, 1);

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        // Check if there is a prefix sum that matches sum - k
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
            // Update the frequency of the current sum

map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
        }
        System.out.println(count);
    }


        // Update the frequency of the current sum
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        int k = 6;
        countSubarray(arr, k);
    }
}
