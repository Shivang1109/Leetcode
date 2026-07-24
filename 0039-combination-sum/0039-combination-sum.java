class Solution {
    static void solve(int[] candidates, int target, int i, List<Integer> out, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(out));
            return;
        }
        if(i==candidates.length) return;
        if(target<0) return;
        
        out.add(candidates[i]);
        solve(candidates,target-candidates[i],i,out,res);
        out.remove(out.size()-1);
        solve(candidates,target,i+1,out,res);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> out = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int i=0;
        solve(candidates,target,i,out,res);
        return res;     
    }
}