import java.util.*;

public class AOneAndTwo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long count = 0;
            int k = -1;
            long cur = 0;
            for(int i=0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 2) count++;

            }
            for(int i = 0 ; i < n-1 ; i++){
                if(arr[i] == 2){
                    cur++;
                    count--;
                }
                if(cur == count){
                    k = i+1;
                    break;
                }
            }
            System.out.println(k);
        }
    }

    
}
