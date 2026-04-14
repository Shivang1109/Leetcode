class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long)length*width*height;
        int l=length,w=width,h=height;
        boolean bulky = false;
        boolean heavy = false;
        if(l>=10000 || w>=10000 || h>=10000 || volume>=1000000000){
            bulky=true;
        }
        if(mass>=100){
            heavy=true;
        }
        
        if (bulky && heavy) return "Both";
        else if (bulky) return "Bulky";
        else if (heavy) return "Heavy";
        else return "Neither";
        
        
    }
}