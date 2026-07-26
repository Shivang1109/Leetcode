class Solution {
    static void solve(int[] candidates, int index, int target, List<Integer> res, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(target<0){
            return;
        }
        if(index>=candidates.length) return;

        res.add(candidates[index]);
        solve(candidates,index+1,target-candidates[index],res,ans);
        int j=index;
        while(j<candidates.length-1 && candidates[j]==candidates[j+1]){
            j++;
        }
        
        res.remove(res.size()-1);
        solve(candidates,j+1,target,res,ans);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        solve(candidates,i,target,res,ans);
        return ans;   
    }
}