import java.util.*;
public class Comparision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            String s = sc.next();
            int result = Integer.MIN_VALUE ;
            int temp = 1 ;
            for(int i = 1 ; i < n ; i++){
                if(s.charAt(i) == s.charAt(i - 1)) temp++;
                else temp = 1;
                result = Math.max(result,temp);

            }
            result = Math.max(result,temp);

            System.out.println(result+1);
        }
    }
}