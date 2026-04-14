int maxProduct(int n) {
    int count=0;
    int temp=n;
    while(temp>0){
        temp/=10;
        count++;
    }
    if(count<2) return n;
    int arr[count];
    for(int i=0;i<count;i++){
        arr[i]=n%10;
        n=n/10;
    }
    int max1=-1,max2=-1;
    for(int i=0;i<count;i++){
        if(max1<arr[i]){
            max2=max1;
            max1=arr[i];   
        }
        else if(arr[i] > max2) {
            max2 = arr[i];
        }
    }
    return(max1*max2);
}