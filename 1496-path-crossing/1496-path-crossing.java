import java.awt.Point;
import java.util.*;


class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<Point> set=new HashSet<>();
        set.add(new Point(x,y));
        for(char c:path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='W') x--;
            else if(c=='E') x++;
            Point p=new Point(x, y);
            if(set.contains(p)){
                return true;
            }
            set.add(p);
        }
        return false;
    }
}