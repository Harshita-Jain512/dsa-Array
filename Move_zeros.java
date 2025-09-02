import java.util.ArrayList;

public class Move_zeros{
    public static void zeros(int [] arr){
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i]!= 0){
               temp.add(arr[i]);
            }
        }
        int nz = temp.size();
        for(int i = 0; i<nz; i++){
            arr[i] = temp.get(i);
        }
        for(int i = nz; i<n; i++){
            arr[i] = 0;
        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int [] arr = {1,0,3,0,6,5,9,0,1};
        zeros(arr);
    }
}
