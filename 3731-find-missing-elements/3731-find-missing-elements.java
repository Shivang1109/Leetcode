class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int[] arr=new int[max+1];
        for(int i:nums){
            arr[i]=1;
        }
        for(int i=min;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
        
    }
}