class Solution {
    static void solve(String digits, StringBuilder sb, List<String> list, String[] arr, int index){
        //base case
        if(index==digits.length()){
            list.add(sb.toString());
            return;
        }  
        int val=digits.charAt(index)-'0';
        String mapped = arr[val];
        for(int i=0;i<mapped.length();i++){
            sb.append(mapped.charAt(i));
            solve(digits,sb,list,arr,index+1);
            sb.deleteCharAt(sb.length()-1);
        }


    }
    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        solve(digits,sb,list,arr,index);
        return list;
        
    }
}