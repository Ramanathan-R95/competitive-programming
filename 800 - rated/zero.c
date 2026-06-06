#include<stdio.h>
#include<stdlib.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,i,b,x=1;
        int * num ;
        scanf("%d",&n);
        num=(int *)malloc(sizeof(int)*n);
        for(i=0;i<n;i++){
            scanf("%d",(num+i));
            

        }
        for(x=0;x<256;x++){
            b=(x^num[0]);

            for(i=1;i<n;i++){
                b ^= (x^num[i]);
            }
            if(b==0){
                printf("%d\n",x);
                break;
            }
        }
        if(x==256){
            printf("%d\n",-1);
        }



    }



    return 0;
}