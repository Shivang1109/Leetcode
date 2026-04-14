int evenNumberBitwiseORs(int* nums, int numsSize) {
    int or=0;
    int count=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%2==0){
            or= or | nums[i];
            count++;

        }
        
    }
    if(count==0){
        return 0;
    }
    return or;
    
}