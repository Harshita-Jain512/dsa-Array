public class pascalTriangle_ElementAtThatPlace {
    public static int getElementAt(int [][]arr, int row, int col){
        int res = 1;
        for(int i=0; i< col; i++){
            res = res * (row -  i);
            res  = res /(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 2;
        int [][]arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println(getElementAt(arr, row - 1, col - 1));
    }
}
