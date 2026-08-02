class Solution {
    static void solve(int index, List<List<Integer>> ans, int[] nums){
        if(index==nums.length){
            List<Integer> output = new ArrayList<>();
            for(int i:nums){
                output.add(i);
            }
            ans.add(new ArrayList(output));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            solve(index+1,ans,nums);
            swap(i,index,nums); //backtrack to restore original array;
        }



    }
    static void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,ans,nums);
        return ans;

    }
}