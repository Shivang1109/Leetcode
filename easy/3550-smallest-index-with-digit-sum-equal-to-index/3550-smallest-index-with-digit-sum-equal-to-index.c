int smallestIndex(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++){
        int num=nums[i];
        int dig_sum=0;
        while(num>0){
        dig_sum+=num%10;
        num/=10;
        }
        if(dig_sum==i){
            return i;
        }
            
    }
    return -1;
    
}