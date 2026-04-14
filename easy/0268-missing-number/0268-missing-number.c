int missingNumber(int* nums, int numsSize) {
    int total=0;
    for(int i=0;i<=numsSize;i++){
        total = total ^ i;
    }
    int given=0;
    for(int i=0;i<numsSize;i++){
        given= given ^ nums[i];
    }
    int final= given ^ total;
    return final;
    
}