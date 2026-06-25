class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        char[] arr = s.toCharArray();
        while(i<j){
            char c1=arr[i];
            char c2=arr[j];
            if(vowels.contains(String.valueOf(arr[i]))&&vowels.contains(String.valueOf(arr[j]))){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
            else if(!vowels.contains(String.valueOf(arr[i]))){
                i++;
            }
            else if(!vowels.contains(String.valueOf(arr[j]))){
                j--;
            }

        }
        return new String(arr);
        
    }
}