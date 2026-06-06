#include<stdio.h>
#include<stdlib.h>
int main(){

    int t ;
    scanf("%d", &t);
    while(t--){
        int n , *arr,result = 0 ,temp1,temp2 ;
        scanf("%d",&n);
        arr = (int *)malloc(sizeof(int)*n);
        for(temp1=0;temp1<n;temp1++){
            scanf("%d",(arr+temp1));
        }
        temp1 = 0;
        while(temp1 < n){
            if(arr[temp1] == 0){
                temp2 = temp1 + 1 ;
                while(temp2 < n &&  arr[temp2] == 0) temp2++;
                
                result = result > temp2 - temp1 ? result : temp2 - temp1;
                temp1 = temp2;
            
            }
            else {
                temp1++;
            }

        }
        printf("%d\n",result);
        free(arr);
    }


    return 0;
}