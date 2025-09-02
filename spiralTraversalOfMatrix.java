import java.util.ArrayList;

public class spiralTraversalOfMatrix {
    public static void doSpiralTraversal(int [][]arr){
        ArrayList<Integer>ans = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        int top = 0;
        int bottom = arr.length -1;
        while(left<=right && top<=bottom){
            for(int i = left; i<=right;i++){
                ans.add(arr[top][i]);
            }
                top++;
            for(int i = top; i<=bottom;i++){
                ans.add(arr[i][right]);
            }
                right--;
            for(int i = right; i>=left;i--){
                ans.add(arr[bottom][i]);
            }
                bottom--;
            for(int i = bottom; i>=top;i--){
                ans.add(arr[i][left]);
            }
                left++;

        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4,5,6},{20,21,22,23,24,7},{19,32,33,34,25,8},{18,31,36,35,26,9},{17,30,29,28,27,10},{16,15,14,13,12,11}};
        doSpiralTraversal(arr);
    }
}
