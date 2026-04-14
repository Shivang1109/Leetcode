int alternatingSum(int* nums, int numsSize) {
    int evenidx=0;
    int oddidx=0;
    for(int i=0;i<numsSize;i++){
        if(i%2==0){
            evenidx+=nums[i];
        }
        else{
            oddidx+=nums[i];
        }
    }
    return(evenidx-oddidx);
    
}