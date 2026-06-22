class Solution {
    public boolean isLeapOrNot(int year){
            if((year%4==0 && year%100!=0) || (year%400==0)){
                return true;
            }
            return false;

    }
    public int isLeap(int year){
        int count=0;
        for(int i=1900;i<year;i++){
            if((i%4==0 && i%100!=0) || (i%400==0)){
                count++;
            }
        }
        return count;
    }
    public int countDays(String s){
        int year = Integer.parseInt(s.substring(0, 4));
        int month=Integer.parseInt(s.substring(5, 7));
        int day=Integer.parseInt(s.substring(8,10));
        int totalDays=0;
        int daysInMonth=0;
        for(int i=1;i<month;i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                daysInMonth += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                daysInMonth += 30;
            } else if (i == 2) {
                if(isLeapOrNot(year)){
                    daysInMonth += 29;
                }
                else{
                    daysInMonth += 28;
                }
            }
        }
        int leapdays=isLeap(year);
        totalDays= (year-1900)*365+leapdays+daysInMonth+day;
        return totalDays;
    }
    public int daysBetweenDates(String date1, String date2) {
        int year1 = countDays(date1);
        int year2 = countDays(date2);
        return Math.abs(year1-year2);
    }
}