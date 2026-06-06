import java.util.Scanner ;

public class CoverWater{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while(t-- != 0){
            int n = sc.nextInt() ;
            String s = sc.next() ;
            if(s.contains("..."))
                System.out.println(2) ;
            else {
                int c = 0 ;
                for(int i=0 ; i<n; i++){
                    if(s.charAt(i) =='.' ) 
                        c++;
                }
                System.out.println(c) ;
            }
        }


    }
}