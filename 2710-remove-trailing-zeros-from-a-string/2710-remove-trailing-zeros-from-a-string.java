class Solution {
    public int findIndex(String num){
        char[] arr=num.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0'){
                //nothing;
            }
            else{
                return i;
            }
        }
        return -1;
    }
    public String removeTrailingZeros(String num) {
        int index=findIndex(num);
        return num.substring(0,index+1);
      

    }
}