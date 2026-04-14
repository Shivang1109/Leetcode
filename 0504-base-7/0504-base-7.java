class Solution {
    public String convertToBase7(int num) {
        int i=0,res=0;
        if(num>0){
        while(num>0){
            int rem=num%7;
            res+=rem*(int)Math.pow(10,i);
            num/=7;
            i++;
        }
        return String.valueOf(res);
        }
        else if(num<0){
            num=(-num);
            while(num>0){
            int rem=num%7;
            res+=rem*(int)Math.pow(10,i);
            num/=7;
            i++;
            

        }
        int fin_res=-res;
        return String.valueOf(fin_res);
        }
        else{
            return String.valueOf(0);
        }
        
    }
}