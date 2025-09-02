public class Set_Matrix_0_brute {
    public static void set_matrix_zero(int [][]arr , int n, int m){
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m; j++){
                if(arr[i][j] == 0){
                    markRow(arr,n,m,i);
                    markCol(arr,n,m,j);
                }
            }
            
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(" " +arr[i][j]);
                
            }
            System.out.println();
        }
    }
    public static void markRow(int [][]arr, int n, int m, int i){
        for(int j = 0;j<m;j++){
            if(arr[i][j]!=0){
                arr[i][j] = -1;
            }
        }
    }
        public static void markCol(int [][]arr, int n, int m, int j){
        for(int i = 0;i<n;i++){
            if(arr[i][j]!=0){
                arr[i][j] = -1;
            }
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
