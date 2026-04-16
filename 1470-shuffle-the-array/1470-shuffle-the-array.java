class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] arr=new int[2*n];
        for(int k=0;k<nums.length;k++){
            arr[k++]=nums[i++];
            arr[k]=nums[j++];
        }
        return arr;
        
    }
}