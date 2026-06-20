class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String word : word1) {
            sb1.append(word);
        }
        for(String word : word2) {
            sb2.append(word);
        }
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        return s1.equals(s2);
    }
}