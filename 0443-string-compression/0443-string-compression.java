class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int write=0;
        while(i<n){
            char curr=chars[i];
            int count=0;
            while(i<n && chars[i]==curr){
                count++;
                i++;
            }
            chars[write++]=curr;
            if(count>1){
                String cnt=Integer.toString(count);
                for(char c:cnt.toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;    
    }
}