class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        if(list.size()<k){
            return "";
        }
        else{
            return list.get(k-1);
        }
    }

}