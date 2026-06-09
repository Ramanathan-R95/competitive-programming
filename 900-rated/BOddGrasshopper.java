import java.util.*;
public class BOddGrasshopper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            long x = sc.nextLong();
            long n = sc.nextLong();
            long result,temp ;
            temp = n % 4;
            if(x % 2 == 0){
                
                if(temp == 0) 
                    result = x;
                else if(temp == 1)
                    result = x - n;
                else if(temp == 2)
                    result = x + 1;
                else
                    result = n + x + 1;
                

            }else{
                if(temp == 0) 
                    result = x;
                else if(temp == 1)
                    result = x + n;
                else if(temp == 2)
                    result = x -1;
                else 
                    result = x - n - 1;

            }
            System.out.println(result);
        }
    }
}