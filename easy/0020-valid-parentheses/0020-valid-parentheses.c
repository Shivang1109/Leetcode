#include <string.h>
#define Size 10000
char stack[Size];
int top=-1;

void push(int x){
    if(top==Size-1){
        return;
    }
    else{
        top++;
        stack[top]=x;
    }
}

char pop(){
    if (top==-1){
        return 0;
    }
    else{
        char temp=stack[top];
        top--;
        return temp;
    }

}

bool isValid(char* s) {
    top=-1;
    int l=strlen(s);
    for(int i=0;i<l;i++){
        if (s[i]=='(' || s[i]=='{' || s[i]=='['){
            push(s[i]);

        }
        else if(s[i]==')'){
            if (top==-1) return false;
            if(stack[top]=='('){
                pop();
            }
            else{
                return false;
            }
        }
        else if(s[i]==']'){
            if (top==-1) return false;
            if(stack[top]=='['){
                pop();
            }
            else{
                return false;
            }
        }
        else if(s[i]=='}'){
            if (top==-1) return false;
            if(stack[top]=='{'){
                pop();
            }
            else{
                return false;
            }
        }
    }
    if(top==-1){
        return true;
    }
    else{
        return false;
    }

    
}