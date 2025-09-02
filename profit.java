public class profit {
    public static void buy_and_sell_stock(int []arr){
        int maxProfit = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                int profit = arr[j] - arr[i];
                 maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        buy_and_sell_stock(arr);
    }
}
