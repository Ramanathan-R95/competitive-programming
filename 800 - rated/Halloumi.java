import java.util.Scanner ;

public class Halloumi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while(t-- != 0){
            int n = sc.nextInt() ;
            int k = sc.nextInt() ;
            int[] a  = new int[n] ;
            for(int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt() ;
            }
            if(k == 1) {
                boolean temp = true ;
                for(int i = 1 ; i < n ; i++){
                    if(a[i] < a[i-1]){
                        temp = false ;
                        break ;
                    }
                }
                
                if(temp) System.out.println("YES") ;
                else System.out.println("NO") ;
            }
            else{
                System.out.println("YES") ;
            }
        }

    }
}