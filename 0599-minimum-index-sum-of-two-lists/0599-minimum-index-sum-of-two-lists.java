class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int sum=map.get(list2[j])+j;

                if(sum<min){
                    list.clear();
                    list.add(list2[j]);
                    min=sum;
                }
                else if(sum==min){
                    list.add(list2[j]);
                }
            }
        }
        String[] ans=list.toArray(new String[0]);
        return ans;
    }
}