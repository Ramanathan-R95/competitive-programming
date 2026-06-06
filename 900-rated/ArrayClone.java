import java.util.*;
public class ArrayClone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            long [] arr = new long[n];
            long max = 0 ;
            long result = 0 ;
            Map<Long,Long> map = new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1L);
                }
                max = Math.max(max,map.get(arr[i]));


            }
            while(max < n){
                result++;
                if( 2  * max < n){
                    result += max;
                    max = 2 * max ;
                }
                else{
                    result += n - max;
                    max = n;
                }
            }
            System.out.println(result);

    }
}
}