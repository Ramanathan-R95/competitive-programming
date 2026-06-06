#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n , k ;
        scanf("%d",&n);
        scanf("%d",&k);
        if(n % 2 == 0 ){
            printf("YES\n");
        }
        

        
        else if(k % 2 == 0){
            printf("NO\n");
        }
        
        else{
            printf("YES\n");

        }


    }

    return 0 ;
}