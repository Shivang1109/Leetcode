class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append((int)s.charAt(i)-'a'+1);
        }
        String s1 = sb.toString();
        int sum=0;
            for(int i = 0; i < s1.length(); i++){
                sum+=(int)s1.charAt(i)-'1'+1;
            }
            int j=1;
            if(k==1){
                return sum;
            }
            while(j<k){
                int sum1=0;
                while(sum!=0){
                    int rem=sum%10;
                    sum1+=rem;
                    sum=sum/10;
                }

                j++;
                sum=sum1;
                if(sum<=9){
                    break;
                }
            }
        return sum;


    }
}