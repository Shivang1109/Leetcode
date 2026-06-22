class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (char c : text.toCharArray()) {
            arr[c - 'a']++;
        }
        //b=1 a=0 l,l=11, o,o=14, n=13;
        int min = Integer.MAX_VALUE;
        min=Math.min(min,arr['b'-'a']); //b
        min=Math.min(min,arr['a'-'a']); //a
        min=Math.min(min,arr['l'-'a']/2); //ll
        min=Math.min(min,arr['o'-'a']/2); //oo
        min=Math.min(min,arr['n'-'a']); //n
        return min;
    }
}