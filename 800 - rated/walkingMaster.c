#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int x1,y1,x2,y2;
        scanf("%d",&x1);
        scanf("%d",&y1);
        scanf("%d",&x2);
        scanf("%d",&y2);
        if(y2 < y1){
            printf("%d\n",-1);
        }
        else{
            int temp = y2 - y1;
            x1 = x1+ temp;
            if(x2 > x1 ){
                printf("%d\n",-1);

            }
            else{
                printf("%d\n",(x1-x2 +temp));


            }

        }




    }


    return 0;
}