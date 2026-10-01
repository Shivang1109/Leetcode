class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        Map<String,Integer> map = new HashMap<>();
        int base = 0;
        int maxGain = 0;
        for(int i=0;i<nums.length-1;i++){
            int a = nums[i];
            int b = nums[i+1];
            if(a==b){
                base++;
            }
            else{
                int x = Math.min(a,b);
                int y = Math.max(a,b);
                String key = x + "#" + y;
                int count = map.getOrDefault(key,0)+1;
                map.put(key,count);

                maxGain = Math.max(maxGain,count);
            }
        }
        return base+maxGain;
     }
}