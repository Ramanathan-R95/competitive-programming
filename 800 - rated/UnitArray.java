import java.util.Scanner;
public class UnitArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int pos=0,neg=0;
            int temp;
            int result = 0 ;
            for(int i=0;i<n;i++){
                temp = sc.nextInt();
                if(temp < 0) neg++;
                
            }
            pos = n -neg;
            if(neg > pos){
                int count = (neg - pos + 1)/2;
                result += count;
                neg -= count ;
                pos += count;



            }
            if(neg % 2 == 1 ) result += 1;
            System.out.println(result);
        }
    }
}