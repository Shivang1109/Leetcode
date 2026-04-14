class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes){
            return k;
        }
        else if(k>numOnes && k<=numOnes+numZeros){
            return numOnes;
        }
        else if(k>numOnes+numZeros && k<numOnes+numZeros+numNegOnes){
            int temp=k-(numOnes+numZeros);
            return numOnes-temp;


        }
        else{
            return numOnes-numNegOnes;
        }
        
    }
}