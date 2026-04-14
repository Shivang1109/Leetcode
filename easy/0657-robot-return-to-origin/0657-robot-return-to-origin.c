#include <string.h>
bool judgeCircle(char* moves) {
    int Lcount=0,Rcount=0,Ucount=0,Dcount=0;
    for(int i=0;i<strlen(moves);i++){
        if(moves[i]=='L'){
            Lcount++;
        }
        else if(moves[i]=='R'){
            Rcount++;
        }
        else if(moves[i]=='U'){
            Ucount++;
        }
        else if(moves[i]=='D'){
            Dcount++;
        }
    }
    if(Lcount==Rcount && Ucount==Dcount){
            return true;
        }
    else{
        return false;
    }
    
}