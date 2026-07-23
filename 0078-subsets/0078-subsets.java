class Solution {
    static void getSubsets(int[] arr, int i, List<Integer> res, List<List<Integer>> ans){
        if(i>=arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[i]);
        getSubsets(arr,i+1,res,ans);
        res.remove(res.size()-1);
        getSubsets(arr,i+1,res,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(nums,i,res,ans);
        return ans;

        
    }
}