class Solution {
    public boolean checkDivisibility(int n) {
        int digSum = 0;
        int digProd = 1;
        int temp = n;
        while(temp!=0){
            int rem = temp %10;
            digSum += rem;
            digProd *= rem;
            temp = temp/10;
        }
        int totalSum = digSum + digProd;
        return n%totalSum==0;
        
    }
}