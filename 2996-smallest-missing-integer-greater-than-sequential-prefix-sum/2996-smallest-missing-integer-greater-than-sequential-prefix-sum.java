class Solution {
    public int BinarySearch(int arr[],int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+ (right-left)/2;
            if(key==arr[mid]){
                return 1;
            }
            else if(key>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return 0;

    }
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]-nums[i-1]==1){
            sum+=nums[i];
        }
        else{
            break;
        }
        }
        Arrays.sort(nums);
        int result=BinarySearch(nums,sum);
        while(result!=0){
                sum++;
                result=BinarySearch(nums,sum);
            }
            return sum;
        }

        

        
    }
