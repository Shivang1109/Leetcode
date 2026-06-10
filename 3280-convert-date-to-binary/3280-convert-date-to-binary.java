class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            int num=Integer.parseInt(s);
            sb.append(Integer.toBinaryString(num));
            sb.append('-');
        }
        sb.deleteCharAt(sb.length()-1);
        String res=sb.toString();
        return res;
    }
}