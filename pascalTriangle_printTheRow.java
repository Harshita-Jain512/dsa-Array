import java.util.*;
public class pascalTriangle_printTheRow {
    public static List<Integer> getElementAt(int [][]arr, int row, List<Integer>res){
        for(int i=0; i<=row; i++){
            res.add(arr[row][i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int row = 4;
        int [][]arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        List<Integer>res = new ArrayList<>();
        System.out.println(getElementAt(arr, row - 1, res));
    }
}
