#include<stdio.h>

int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        unsigned long  long a,b,n,i,temp,min,result = 0 ;
        scanf("%llu %llu %llu",&a,&b,&n);
        if(b > 1) result += b-1;
        for(i=0;i<n;i++){
            scanf("%llu",&temp);
            min = temp < a - 1 ? temp : a - 1 ;
            result += min ;

        }
        printf("%llu\n",result + 1);
    }




    return 0;
}