public class rotateMatrixBy90Degree{
    public static void doRotation(int [][]arr, int n){
        int [][]ans = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                ans[j][n-1-i] = arr[i][j];
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        doRotation(arr, n);
    }
    
}