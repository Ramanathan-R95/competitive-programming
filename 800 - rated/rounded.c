#include<stdio.h>
#include<math.h>
int main(){
    long int t,num,n,temp;
    scanf("%ld",&t);
    while(t--){
        scanf("%ld",&num);
        n = 0;
        temp = num;
        while(temp > 0){
            temp = temp/10;
            n +=1;
        }
        printf("%ld\n",9 * (n-1) + num/(long)pow(10,n));


    }


    return 0;
}