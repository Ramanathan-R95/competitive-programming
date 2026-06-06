import java.util.Scanner ;

public class Problem3{
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while(t-- != 0){
            String s = sc.next() ;
            int l = s.length() ;
            if(l <= 10 ) 
                System.out.println(s) ;
            else 
                System.out.println(""+s.charAt(0)+(l-2) + s.charAt(l-1)) ;
        }
    }
}