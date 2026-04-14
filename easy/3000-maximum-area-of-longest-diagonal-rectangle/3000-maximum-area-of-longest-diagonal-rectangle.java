class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag=0;
        int maxArea=0;
        for(int i=0;i<dimensions.length;i++){
            int a=dimensions[i][0];
            int b=dimensions[i][1];
            int diag=(a*a + b*b);
            int area=(a*b);
            if(diag>maxDiag){
                maxDiag=diag;
                maxArea=area;
            }
            else if(diag==maxDiag){
                maxArea=Math.max(area,maxArea);
            }    
        }
        return maxArea;
        
    }
}