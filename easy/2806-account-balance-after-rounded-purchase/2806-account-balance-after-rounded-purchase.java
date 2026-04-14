class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int original=100-purchaseAmount;
        int rem=original%10;
        if(rem<=5){
            original=original-rem;
        }
        else{
            original=(original-rem)+10;
        }
        return original;
    }
}