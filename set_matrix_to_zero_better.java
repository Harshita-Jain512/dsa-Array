public class set_matrix_to_zero_better {
    public static void set_matrix_zero(int [][]arr, int n, int m){
        int []row = new int[n];
        for(int i = 0; i<n; i++){
            row[i] = 0;
        }
         int []col = new int[m];
        for(int i = 0; i<m; i++){
            col[i] = 0;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        for(int i = 0;i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        //System.out.println(n+ " " +m);
        set_matrix_zero(arr, n, m);
    }
}
