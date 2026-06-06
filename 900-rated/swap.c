#include<stdio.h>
#include<limits.h>
int gcd(int a ,int b){
    int temp ;
    while(b){
        temp = b ;
        b = a % b;
        a = temp;
    }
    return a;
}

int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,i = 1,result=0;
        int temp ,temp2;
        scanf("%d",&n);
        for(i;i<=n;i++){
            scanf("%d",&temp);
            if(temp - i) {
                temp2 = temp - i < 0 ? (temp - i )* (-1) : temp - i;
                result = gcd(result,temp2);
                



            }



        }
        printf("%d\n",result);
        



    }


    return 0;
}