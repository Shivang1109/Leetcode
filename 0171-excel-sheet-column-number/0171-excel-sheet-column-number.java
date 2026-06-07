class Solution {
    public int titleToNumber(String columnTitle) {
        char[] arr=columnTitle.toCharArray();
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int temp=(int)arr[i]-64;
            res= res*26+temp;
        }
        
    return res;
        
    }
}