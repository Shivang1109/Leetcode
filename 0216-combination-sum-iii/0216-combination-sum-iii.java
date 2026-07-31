class Solution {
    static void solve(int i, int k, int n, int[] arr, List<Integer> res, List<List<Integer>> ans){
        if(res.size()==k && n==0){
            ans.add(new ArrayList(res));
            return;
        }
        if(res.size()==k) return;
        if(n<0) return;
        if(i==arr.length) return;

        res.add(arr[i]);
        solve(i+1,k,n-arr[i],arr,res,ans);
        res.remove(res.size()-1);
        solve(i+1,k,n,arr,res,ans);



        

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int i=0;
        List<Integer> res= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9};
        solve(i,k,n,arr,res,ans);
        return ans;


        
        
    }
}