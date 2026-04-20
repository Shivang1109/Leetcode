class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        while(j>i && colors[i]==colors[j]){
            j--;
            
        }
        int max1=j-i;
        int k=0;
        int l=colors.length-1;
        while(l>k && colors[k]==colors[l]){
            k++;
            
        }
        int max2=l-k;
        int res=Math.max(max1,max2);
        
        
        return res;
        
    }
}