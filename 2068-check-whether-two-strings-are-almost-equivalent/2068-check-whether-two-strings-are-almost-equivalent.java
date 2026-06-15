class Solution {
        public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : word1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : word2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(int value: map.values()) {
            if(Math.abs(value) > 3) {
                return false;
            }
        }
        return true;
    }
}