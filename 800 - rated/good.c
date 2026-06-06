#include<stdio.h>
#include<stdlib.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,i,t1,t2,result=0;
        int *p;
        scanf("%d",&n);
        p = (int *)malloc(sizeof(int)*n);
        for(i=0;i<n;i++){
            scanf("%d",(p+i));
        }
        for(i=1;i<n;i++){
            t1 = p[i-1] % 2;
            t2 = p[i] % 2;
            if(t1 == t2){
                result += 1;
                // p[i] = p[i] * p[i - 1];
            }


        }
        printf("%d\n",result);
        free(p);
    }


    return 0;
}