class Solution {
    static void solve(int[] nums, int index, List<Integer> res, List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        //include
        res.add(nums[index]);
        solve(nums, index+1, res, ans);
        //exclude
        //agar koi duplicates aaya toh skip krne ke liye
        //direct unique element pe jump krne ke liye aek j index ko maintain krna padega ;
        int j=index;
        while(j<nums.length-1 && nums[j]==nums[j+1]){
            j++;
        }
        //remove the element added as it is excluded 
        res.remove(res.size()-1);
        solve(nums, j+1, res, ans);
        return;

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int index=0;
        solve(nums, index, res, ans);
        return ans;

        
    }
}