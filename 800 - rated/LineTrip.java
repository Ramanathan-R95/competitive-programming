import java.util.Scanner ;

public class LineTrip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while (t-- != 0) {
            int n = sc.nextInt() ;
            int x = sc.nextInt() ;
            int[] array = new int[n] ;
            int minCapacity = Integer.MIN_VALUE ;
            for (int i=0 ; i < n ; i++){
                array[i] = sc.nextInt() ;
                if( i > 0) 
                    minCapacity = Math.max(minCapacity,array[i] - array[i-1]) ;
                }
            minCapacity = Math.max(minCapacity, array[0]) ;
            minCapacity = Math.max(minCapacity,(x - array[n - 1]) * 2 ) ;
            System.out.println(minCapacity) ;
            
            
        }
    }
}