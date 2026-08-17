class Solution {

    static void merge(int[] index, int s, int e, int mid, int[] nums, int[] temp, List<Integer> list){ 
        int i=s;
        int j=mid+1;
        int k=s;
        while(i<=mid && j<=e){
            if(nums[index[i]] > nums[index[j]] ){
                temp[k++]=index[j++];
            }
            else{
                //add kya krna hai
                int addFreq = j-(mid+1);
                // ab main cheez yahan pe hoga
                // agar j chhota hai to j++ hota rhega aur jab i chhota ho jayega toh ans me i ki index j plus kr denge kyuki utne number chhote hai i se
                // uar i ko ++ kr denge 
                list.set(index[i], list.get(index[i])+addFreq);
                temp[k++]=index[i++];
            }
        }
        //agar sirf left wale part me element bacha hai to
        while(i<=mid){
            int addFreq=j-(mid+1);
            list.set(index[i], list.get(index[i])+addFreq);
            temp[k++]=index[i++];
            
        }
        //agar sirf right wale part me element bachha hai to simple unn sabko add krdo
        while(j<=e){
            temp[k++]=index[j++];
        }
        //temp ko waps index array me bhej do;
        for(int x=s;x<=e;x++){
            index[x]=temp[x];
        }

    }

    static void mergeSort(int[] index, int s, int e, int[] nums, int[] temp, List<Integer> list){
        if(s>=e){
            return;
        }
        int mid = s+ (e-s)/2;
        mergeSort(index,s,mid,nums,temp,list);
        mergeSort(index,mid+1,e,nums,temp,list);
        merge(index,s,e,mid,nums,temp,list);

    }



    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int[] index = new int[n];
        int[] temp = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            index[i]=i;
            list.add(0);
        }
        mergeSort(index,s,e,nums,temp,list);
        return list;

    }
}