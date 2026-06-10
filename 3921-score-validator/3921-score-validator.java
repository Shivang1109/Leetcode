class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(String event : events){
            if(event.matches("[0-6]")){
                int num=Integer.parseInt(event);
                score+=num;
            }
            else if(event.equals("W")){
                counter++;
            }
            else{
                score++;
            }
            if(counter==10){
                return new int[]{score,counter};

            }
        }
        return new int[]{score,counter};
    }
}