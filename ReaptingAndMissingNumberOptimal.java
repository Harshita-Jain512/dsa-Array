public class ReaptingAndMissingNumberOptimal {

    public static int[] find(int[] arr) {

        int n = arr.length;

        int s = 0;      // Sum of array elements
        int sn = 0;     // Sum of first n natural numbers
        int ss = 0;     // Sum of squares of array elements
        int ssn = 0;    // Sum of squares of first n natural numbers

        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            s += arr[i];
            ss += arr[i] * arr[i];
        }

        for (int i = 1; i <= n; i++) {
            sn += i;
            ssn += i * i;
        }

        int ans = s - sn;             // x - y
        int finalans = ss - ssn;      // x² - y²

        finalans = finalans / ans;    // x + y

        int x = (ans + finalans) / 2; // Repeating number
        int y = x - ans;              // Missing number

        result[0] = x;
        result[1] = y;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};

        int[] result = find(arr);

        System.out.println("Repeating number is: " + result[0]);
        System.out.println("Missing number is: " + result[1]);
    }
}