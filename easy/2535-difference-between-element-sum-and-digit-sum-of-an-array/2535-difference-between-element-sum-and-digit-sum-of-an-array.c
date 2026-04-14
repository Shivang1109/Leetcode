int differenceOfSum(int* nums, int numsSize) {
    int elm_sum=0;
    int abs_sum=0;
    for(int i=0;i<numsSize;i++){
        elm_sum+= nums[i];
    }
    for(int i=0;i<numsSize;i++){
        if(nums[i]>9){
            while(nums[i]>0){
                abs_sum+= nums[i]%10;
                nums[i]/=10;
            }
        }
        else{
            abs_sum+=nums[i];
        }
    }
    int final=elm_sum-abs_sum;
    if(final<0){
        final=(-final);
    }
    return final;

    
}