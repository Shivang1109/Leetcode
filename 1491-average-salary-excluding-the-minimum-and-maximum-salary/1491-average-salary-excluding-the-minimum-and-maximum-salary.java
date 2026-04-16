class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        int max=salary[0];
        int min=salary[0];
        int maxind=0;
        int minind=0;
        for(int i=0;i<n;i++){
            if(salary[i]>max){
                max=salary[i];
                maxind=i;
            }
            else if(salary[i]<min){
                min=salary[i];
                minind=i;
            }
        }
        double sum=0;
        for(int j=0;j<n;j++){
            if(j==maxind || j==minind){
                sum=sum;
            }
            else{
                sum+=salary[j];
            }

        }
        return sum/(n-2);
        
    }
}