import java.util.Scanner ;

public class TargetPractice{
    public static void main(String[] args) {
        int t ;
        Scanner sc = new Scanner(System.in) ;
        t = sc.nextInt() ;
        sc.nextLine();

        while(t-- != 0) {
            int score = 0 ;
            for (int i=0 ; i<10 ; i++) {
                String s = sc.nextLine();
                for (int j=0;j<s.length();j++){
                    if(s.charAt(j) == 'X' ) {
                        int min = Math.min(i, j) ;
                        min = Math.min(min , 9 - i) ;
                        min = Math.min(min , 9 - j) ;
                        score += min + 1 ;
                    }


                }

        }
        System.out.println(score) ;
        }

    }
}