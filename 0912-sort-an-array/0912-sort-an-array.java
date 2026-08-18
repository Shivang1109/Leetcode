class Solution {
    static void merge(int[] arr, int p, int q , int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] left= new int[n1];
        int[] right =new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[p+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[q+1+j];
        }
        int i=0,j=0,k=p;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }


    }
    public static void mergesort(int[] arr, int p, int r){
        if(p<r){
            int q=(p+r)/2;
            mergesort(arr,p,q);
            mergesort(arr,q+1,r);
            merge(arr,p,q,r);
        }


    }


    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
}