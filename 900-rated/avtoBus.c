#include<stdio.h>

int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        long long int n ;
        scanf("%lld",&n);
        if(n < 4 || n % 2 == 1){
            printf("%d\n",-1);
        }
        else {
            printf("%lld %lld\n",n/6 + (n % 6 == 0 ? 0 : 1) ,n/4 ) ;
        }

        


        
    }

    return 0;
}