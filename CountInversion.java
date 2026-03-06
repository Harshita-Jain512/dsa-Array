public class CountInversion {
    public int findInversions(int []arr, int n){
        int count = 0;
        for(int i = 0; i< n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(i < j && arr[i] > arr[j]){
                    count++;
                }
            }
        }
return count;
    }
    public static void main(String[] args){
        int []arr = {5, 3, 2, 1, 4};
        int n = arr.length;
        CountInversion obj = new CountInversion();
        System.out.println(obj.findInversions(arr, n));
    }
}
