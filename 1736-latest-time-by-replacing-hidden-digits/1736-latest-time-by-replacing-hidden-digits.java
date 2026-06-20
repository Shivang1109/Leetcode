class Solution {
    public String maximumTime(String time) {
        char ch1=time.charAt(0);
        char ch2=time.charAt(1);
        char ch3=time.charAt(3);
        char ch4=time.charAt(4);
        StringBuilder sb=new StringBuilder(time);
        if(ch1=='?'){
            if (ch2=='?' || ch2<='3'){
                sb.setCharAt(0,'2');
            }
            else{
                sb.setCharAt(0,'1');
            }
        }
        if(ch2=='?'){
            if(ch1=='0' || ch1=='1'){
                sb.setCharAt(1,'9');
            }
            else{
                sb.setCharAt(1,'3');
            }
        }
        if(ch3=='?'){
            sb.setCharAt(3,'5');
        }
        if(ch4=='?'){
            sb.setCharAt(4,'9');
        }
        return sb.toString();
    }
}