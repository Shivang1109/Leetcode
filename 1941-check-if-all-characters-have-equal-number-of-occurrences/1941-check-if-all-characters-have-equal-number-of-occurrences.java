class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean allEqual=true;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int first=map.values().iterator().next();
        for(int val:map.values()){
            if(val!=first){
                allEqual=false;
            }
        }
        return allEqual;
    }
}