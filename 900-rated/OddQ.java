import java.util.*;
public class OddQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long temp;
        while(t-- != 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long [] arr = new long[n];
            long [] prefix = new long[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextLong();
                if( j > 0) prefix[j] = prefix[j-1] + arr[j];
                else prefix[j] = arr[j];
            }
            for(int j = 0; j < q ; j++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                temp = prefix[n-1];
                temp -= prefix[r-1];
                if(l-2 > -1) temp += prefix[l-2];
                temp += k * (r-l+1);
                if(temp % 2 == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }
        }
    }
}