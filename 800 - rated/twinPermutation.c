#include<stdio.h>
#include<stdlib.h>
int main(){

    int t,i, n;

    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        int * arr = (int *)malloc(sizeof(int)*n);
        for(i=0;i<n;i++)
            scanf("%d",&arr[i]);
        for(i=0;i<n;i++)
            printf("%d ",n + 1 - arr[i]);
        printf("\n");
        free(arr);
    }



    return 0;
}