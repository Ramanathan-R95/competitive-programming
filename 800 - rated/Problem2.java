import java.util.Scanner ;

public class Problem2{
    public static void main(String[] args){

        
        int t ;
        Scanner sc = new Scanner(System.in) ;
        t= sc.nextInt() ;
        while(t-- != 0) {
            int n , x ,s,total = 0 ;
            n = sc.nextInt() ;
            s = sc.nextInt() ;
            x = sc.nextInt() ;
            int [] a = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt() ;
                total += a[i] ;
            }
            if (total > s )
                System.out.println("NO") ;
            else if((s - total) % x == 0) 
                System.out.println("YES") ;
            else
                System.out.println("No") ;

        }
    }
}