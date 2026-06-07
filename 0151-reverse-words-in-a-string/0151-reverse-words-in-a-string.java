class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
         String s2=sb.toString().trim();
        return s2;

        
    }
}