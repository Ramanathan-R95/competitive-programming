import java.util.Scanner ;

public class Watermelon{
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        if (n == 2) System.out.println("NO") ;
        else if (n % 2 == 0 ) System.out.println("YES") ;
        else System.out.println("NO") ;
    }
}



