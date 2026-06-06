#include<stdio.h>
int main(){
    int t,odd,even,i,temp,n;
    scanf("%d",&t);
    while(t-- !=0){
        odd=0;
        even=0;
        scanf("%d",&n);
        for(i=0;i<n;i++){
            scanf("%d",&temp);
            if(temp % 2 == 1) odd++;
            else even++;
        }
        if(odd % 2 == 0)
            printf("YES\n");
        else
            printf("NO\n");
        

    }
    return 0;
}