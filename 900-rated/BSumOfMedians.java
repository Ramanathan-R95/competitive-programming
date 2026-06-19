import java.util.Scanner;

public class BSumOfMedians {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n  = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n*k];
            long res = 0 ;
            int ind = n - Math.ceilDiv(n, 2);

            for(int i = 0 ; i < n * k ; i++){
                arr[i] = sc.nextLong();
            }
            int i =n * k - ind - 1;
            for(int temp = 0; temp < k ; temp++ ){
                res += arr[i];
                i = i - ind - 1;
            }
            System.out.println(res);

        }

    }
    
}
