#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
int main(){
    int t,i ,temp = 0;
    long temp1 ;
    scanf("%d",&t);
    while(t--){
        int n;
        temp = 0 ;
        long min = INT_MAX;
        scanf("%d",&n);
        long * nums = (long *)malloc(sizeof(long)* n);
        for(i=0;i<n;i++){
            scanf("%ld",(nums+i));
        }
        for(i=1;i<n;i++){
            if(nums[i] < nums[i-1] ){
                temp = 1;
                break;
            }
            temp1 = (nums[i] - nums[i-1])/2 + 1 ;
            min = (min > temp1) ? temp1 : min ;



        }
        if(temp)
            printf("%d\n",0);
        else 
            printf("%ld\n",min);
        
    }

    return 0;
}