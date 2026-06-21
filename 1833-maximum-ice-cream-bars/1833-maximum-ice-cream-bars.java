class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=costs[0];
        for(int cost:costs){
            max=Math.max(max,cost);
        }
        int[] arr=new int[max+1];
        for(int cost:costs){
            arr[cost]++;
        }
        int numberOfBars=0;
        int spent=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) continue;
            int rem=coins-spent;
            int totalCost=i*arr[i];
            if(rem<totalCost){
                numberOfBars+=rem/i;
                break;
            }
            spent+=totalCost;
            numberOfBars+=arr[i];
        }
        return numberOfBars;
        
    }
}