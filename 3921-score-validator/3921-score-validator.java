class Solution {
    public int[] scoreValidator(String[] events) {
        int c=0;
        int sc=0;
        for(int i=0;i<events.length;i++){
            if(c==10){
                break;
            }
            if(events[i].equals("W")){
                c++;
            }
            else if(events[i].equals("WD")||events[i].equals("NB")){
                sc++;
            }
            else{
                sc+=Integer.parseInt(events[i]);
            }
        }
        return new int[]{sc,c};
    }
}