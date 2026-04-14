void sortAscending(int arr[], int n) {
    for(int i = 0; i < n-1; i++) {
        for(int j = 0; j < n-i-1; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int absDifference(int* nums, int numsSize, int k) {
    int min_sum = 0, max_sum = 0;

    if(k > numsSize) k = numsSize;

    sortAscending(nums, numsSize);

    for(int i = 0; i < k; i++){
        min_sum += nums[i];                 
        max_sum += nums[numsSize - 1 - i]; 
    }

    return abs(max_sum - min_sum);
}