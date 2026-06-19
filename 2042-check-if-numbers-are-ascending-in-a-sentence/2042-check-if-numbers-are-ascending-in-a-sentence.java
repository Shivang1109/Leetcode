class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i].charAt(0);
            if(ch>='0' && ch<='9'){
                list.add(Integer.parseInt(arr[i]));
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;


    }
}