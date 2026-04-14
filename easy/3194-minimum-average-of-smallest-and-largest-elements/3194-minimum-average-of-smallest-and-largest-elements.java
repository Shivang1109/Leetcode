class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        int len=nums.length/2;
        double[] arr=new double[len];
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            arr[i]=(nums[i]+nums[n-i-1])/2.0;
        }
        Arrays.sort(arr);
        return arr[0];


        
    }
}