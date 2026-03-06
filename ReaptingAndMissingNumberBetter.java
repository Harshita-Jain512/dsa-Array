public class ReaptingAndMissingNumberBetter {
    public static int[] find(int []arr){
        int []result = new int[arr.length + 1];
        int []ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            result[arr[i]]++;
        }
        for(int i = 1; i < result.length; i++){
            if(result[i] == 2){
                ans[0] = i;
            }else if(result[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int []arr = {3, 5, 4, 1, 1};
        int []result = find(arr);
        System.out.println("Repeating number is: " + result[0]);
        System.out.println("Missing number is: " + result[1]);
    }
}
