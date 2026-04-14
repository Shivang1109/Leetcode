class Solution {
    public int countKeyChanges(String s) {
        String res=s.toLowerCase();
        int count=0;
        for(int i=1;i<res.length();i++){
            if(res.charAt(i)!=res.charAt(i-1)){
                count++;
                
            }
        }
        return count;
    }
}