class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.trim().split(" ");
        int n=arr.length;
        int count=0;
        for(char ch:arr[n-1].toCharArray()){
            count++;
        }
        return count;
    }
}