class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        int ind=0;
        for(int i=1;i<releaseTimes.length;i++){
            int duration=releaseTimes[i]-releaseTimes[i-1];
            if(duration>max){
                max=duration;
                ind=i;
            }
            else if(duration==max){
                if(keysPressed.charAt(i)>keysPressed.charAt(ind)){
                    max=duration;
                    ind=i;
                }
            }
            }
            
        
        return keysPressed.charAt(ind);
        
    }
}