#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,a,b;
        scanf("%d %d %d",&n,&a,&b);
        if(a==n && b==n){
            printf("YES\n");
        }
        else if(a + b >= n || n - (a+b) == 1){
            printf("NO\n");
        }
        else
            printf("YES\n");
    }


    return 0;
}