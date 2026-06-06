import java.util.Scanner ;

public class DontTryToCount{
    public static void main(String[] args){
        int t ;
        Scanner sc = new Scanner(System.in) ;
        t = sc.nextInt() ;
        while (t-- != 0){
            int n = sc.nextInt() ;
            int m = sc.nextInt() ;
            sc.nextLine();
            String x = sc.nextLine() ;
            String s = sc.nextLine() ;
            int c = 0 ;
            boolean temp = false;
            while(x.length() < 256){
                if (x.contains(s)){
                    temp = true;
                    break ;


                }
                c++;

                x = x.concat(x) ;
            }
            if(temp) System.out.println(c) ;
            else System.out.println(-1) ;
        }
    }
}