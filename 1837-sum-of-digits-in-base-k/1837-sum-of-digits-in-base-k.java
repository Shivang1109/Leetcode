class Solution {
    public int sumBase(int n, int k) {
        int i=0;
        int baseK=0;
        while(n!=0){
            int rem=n%k;
            baseK+=rem*(int)Math.pow(10,i);
            n/=k;
            i++;
        }
        int sum=0;
        while(baseK!=0){
            int rem1=baseK%10;
            sum+=rem1;
            baseK/=10;

        }
        return sum;

        
    }
}