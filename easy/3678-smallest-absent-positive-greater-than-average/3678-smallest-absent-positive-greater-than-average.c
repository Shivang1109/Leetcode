int linearSearch(int arr[], int n, int key) {
    for(int i = 0; i < n; i++) {
        if(arr[i] == key) {
            return i;   
        }
    }
    return -1;  
}


int smallestAbsent(int* nums, int numsSize) {
    int sum=0;
    int avg=0;
    int final=0;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
    }
    avg=sum/numsSize;
    int i=avg+1;
    if (i<1) i=1;
    while(1){
        if(linearSearch(nums,numsSize,i)==-1){
            return i;
        }
        i++;
    }
    
    
}