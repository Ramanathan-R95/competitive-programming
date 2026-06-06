#include<stdio.h>
#include<stdlib.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,l,r;
        scanf("%d",&n);
        char * str = (char *)malloc(sizeof(char)*(n+1));
        scanf("%s",str);
        l=0;
        r=n-1;
        while(l < r && str[l] != str[r]){
            l++;
            r--;
        }
        
        if(l > r || n==0){
            printf("%d\n",0);

        }
        else{
            printf("%d\n",r-l+1);
        }
        free(str);



    }

    return 0;
}