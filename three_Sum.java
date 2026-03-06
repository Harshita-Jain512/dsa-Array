import java.util.*;

public class three_Sum {

    // Function to find triplets with sum zero
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Skip duplicate elements for i
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicates for left and right
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return ans;
    }

    // Main method (ENTRY POINT)
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> res = threeSum(arr);

        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }
}