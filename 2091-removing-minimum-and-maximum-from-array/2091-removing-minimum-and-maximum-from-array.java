class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        //sabse phle max aur min ko find kro 
        //saath saath me unke index ko bhi maintain kro 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex=-1;
        int minIndex=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        //case 1 agar front se delete kre toh 
        int ans1 = Math.max(maxIndex,minIndex)+1;

        //case 2 agar back se dono kre toh;
        int ans2 = n - Math.min(maxIndex,minIndex);

        //case 3 agar aek front aek back se ho
        //isme bhi do cases honge agar maxindex front se minindex back se ho
        int ans3 = (maxIndex+1) + (n-minIndex);

        //case 4 agar minidex front se aur maxinde back se ho;
        int ans4 = (minIndex+1) + (n-maxIndex);

        //ab chaaro ans ka min nikal ke return krdo;

        int ans = (Math.min(ans1, Math.min(ans2, Math.min(ans3, ans4))));

        return ans;

        
    }
}