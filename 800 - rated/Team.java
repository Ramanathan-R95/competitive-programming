
import java.util.Scanner ;

public class Team{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int result = 0 ;
        int temp = 0 ;
        while( n-- != 0){
            temp = 0 ;
            for(int i = 0 ; i < 3 ; i++)
                temp += sc.nextInt() ;
            if(temp>1) result += 1;

        }
        System.out.println(result) ;

    }
}