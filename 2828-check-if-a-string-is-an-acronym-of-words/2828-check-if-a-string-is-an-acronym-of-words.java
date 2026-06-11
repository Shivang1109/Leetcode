class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String str:words){
            sb.append(str.charAt(0));
        }
        String res=sb.toString();
        return res.equals(s);
    }
}