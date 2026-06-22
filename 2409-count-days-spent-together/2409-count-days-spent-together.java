class Solution {
    public static int countDays(String month,String day) {
        int totalDays=0;
        int totalMonth=Integer.parseInt(month);
        int days=Integer.parseInt(day);
        int daysInMonth=0;
        for(int i=1;i<totalMonth;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                daysInMonth+=31;
            }
            else if(i==2){
                daysInMonth+=28;
            }
            else{
                daysInMonth+=30;
            }
        }
        totalDays=daysInMonth+days;
        return totalDays;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String arrAlice[]= arriveAlice.split("-");
        String leaAlice[]= leaveAlice.split("-");
        String arrBob[]= arriveBob.split("-");
        String leaBob[]= leaveBob.split("-");
        int arriveAliceDayNumber=countDays(arrAlice[0],arrAlice[1]);
        int leaveAliceDayNumber=countDays(leaAlice[0],leaAlice[1]);
        int arriveBobDayNumber=countDays(arrBob[0],arrBob[1]);
        int leaveBobDayNumber=countDays(leaBob[0],leaBob[1]);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=arriveAliceDayNumber;i<=leaveAliceDayNumber;i++){
            map.put(i,1);
        }
        int count=0;
         for(int i=arriveBobDayNumber;i<=leaveBobDayNumber;i++){
            if(map.containsKey(i)){
                count++;
            }
        }
        return count;
    }
}