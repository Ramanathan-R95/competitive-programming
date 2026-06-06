#include<stdio.h>
#include<stdlib.h>
int main(){
    int t;
    scanf("%d",&t);
    long long int * arr;
    int n,i;
    while(t--){
        long long int val = 0;
        scanf("%d",&n);
        arr = (long long int *)malloc(sizeof(long long int)*n);
        for(i=0;i<n;i++){
            scanf("%lld",&arr[i]);
        }
        for(i=n-2;i>=0;i--){
            while(arr[i] >= arr[i+1]){
                if(arr[i] == 0){
                    val = -1;
                    break;
                }
                val++;
                arr[i]/=2;
                

            }

        }
        printf("%lld\n",val);


    }
    return 0;
}