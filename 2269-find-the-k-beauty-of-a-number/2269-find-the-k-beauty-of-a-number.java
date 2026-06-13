class Solution {
    public int divisorSubstrings(int num, int k) {
        int k_beauty=0;
        if(num<10){
            return 1;
        }
        String n=Integer.toString(num);
        for(int i=0;i+k<=n.length();i++){
           String temp=n.substring(i,i+k);
           int var=Integer.parseInt(temp);
           if(var>0){
               if(num%var==0){
                   k_beauty++;
               }
           }
        }
     return k_beauty;
}
}