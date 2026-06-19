class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation : operations) {
            if(operation.charAt(0) == '+' || operation.charAt(2) == '+') {
                x+=1;
            }
            else if(operation.charAt(0) == '-' || operation.charAt(2) == '-') {
                x-=1;
            }
        }
        return x;
    }
}