import java.util.*;
public class Cacak{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            long n , x , k ;
            n = sc.nextLong();
            k = sc.nextLong();
            x = sc.nextLong();
            long min = (k * (k + 1))/2;
            long max = (n * (n + 1))/2  - ((n-k) * (n-k+1)) / 2;
            if( min <= x && max >= x)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}