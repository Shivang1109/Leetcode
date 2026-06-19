class Solution {
    public int minTimeToType(String word) {
        int n=word.length();
        int counter=0;
        char ch='a';
        for(int i = 0; i < n; i++){
            int diff=0;
            char ch1 = word.charAt(i);
            diff=(26-((ch1-'a')-(ch-'a')))%26;
            if(diff>13) diff=26-diff;
            counter=counter+diff;
            ch=ch1;
        }
        return counter+n;
    }
}