class Solution {
    static void solve(int[] arr, int index, List<Integer> res, List<List<Integer>> ans){
        if(index>=arr.length){
            //base cases
            ans.add(new ArrayList<>(res));
            return;
        }
        //include
        res.add(arr[index]);
        solve(arr, index+1, res, ans);
        //exclude 
        res.remove(res.size()-1);
        solve(arr, index+1, res, ans);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int index=0;
        solve(nums, index, res, ans);
        return ans; 

        
    }
}