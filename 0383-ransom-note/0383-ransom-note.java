class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            }
        }
        System.out.println(map);
        for(int value : map.values()){
            if(value>0){
                return false;
            }
        }
        return true;
    }
}
