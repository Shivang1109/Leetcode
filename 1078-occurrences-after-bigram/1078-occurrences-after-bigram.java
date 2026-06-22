class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr=text.split(" ");
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<=arr.length-3;i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                list.add(arr[i+2]);
            }
        }
        String[] result=list.toArray(new String[0]);
        return result;


    }
}