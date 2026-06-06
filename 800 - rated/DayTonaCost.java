import java.util.* ;

public class DayTonaCost{
    public static void main(String[] args){
        int t ;
        Scanner sc = new Scanner(System.in) ;
        t = sc.nextInt() ;
        int n , k ;
        while(t-- != 0) {
            n = sc.nextInt() ;
            k = sc.nextInt() ;
            HashSet<Integer> set = new HashSet<>() ;
            for(int i = 0 ; i < n ; i++){
                set.add(sc.nextInt()) ;
            }
            if(set.contains(k)) System.out.println("YES") ;
            else System.out.println("NO") ;
            

        }
    }
}