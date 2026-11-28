class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] ans = new String[rain.length];
        int alice = 0;
        int bob = 0;
        for(int i = 0 ; i<rain.length ; i++){
            if(rain[i] == 0){
                ans[i] = "None";
            }
            if(rain[i]==1 &&  i+1 < rain.length && rain[i+1]==1){
                if(alice <= bob){
                    ans[i] = "Alice";
                    alice++;
                }
                else{
                    ans[i] = "Bob";
                    bob++;
                }
            }
            else if(rain[i]==1){
                ans[i] = "Bob";
                bob++;
            }
        }
        return ans;
    }
}