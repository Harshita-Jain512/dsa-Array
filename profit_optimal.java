import java.util.HashMap;

public class profit_optimal {
    public static void buy_and_sell_stock(int []arr){
        int maxProfit = 0;
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            int profit = arr[i] - min ;
           maxProfit = Math.max(maxProfit, profit);
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(maxProfit);

    }
    public static void main(String[] args) {
        int []arr = {1,6,4,3,7};
        buy_and_sell_stock(arr);
    }
}
