class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        boolean hasDuplicate = false;
        for (int freq : map.values()) {
            if (freq >= 2) {
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
        
    }
}