class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int x1 = source[0];
        int y1 = source[1];
        int x2 = target[0];
        int y2 = target[1];
        if(x1 == x2 && y1 == y2) return 0;
        else if((x1+y1)%2 != (x2+y2)%2) return -1;
        else if(Math.abs(x2-x1) == Math.abs(y2-y1)){
            return 1;
        }
        else return 2;

    }
}