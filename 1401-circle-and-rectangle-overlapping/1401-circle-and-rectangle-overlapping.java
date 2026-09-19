class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xClosest = Math.max(x1, Math.min(x2,xCenter));
        int yClosest = Math.max(y1, Math.min(y2,yCenter));

        int dx = xCenter - xClosest;
        int dy = yCenter - yClosest;

        int distance = dx*dx + dy*dy;
        return distance <= radius*radius;

    }
}