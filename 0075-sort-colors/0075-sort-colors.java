class Solution {
    public void sortColors(int[] nums) {
        //counting sort approach;

        int[] freq = new int[]{0,0,0};
        
        for(int num:nums){
            freq[num]++;
        }
        int k = 0;
        for(int i=0;i<3;i++){
            while(freq[i]>0){
                nums[k++]=i;
                freq[i]--;
            }
        } 
    }
}