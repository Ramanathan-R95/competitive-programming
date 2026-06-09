import java.util.*;
public class AAbBalance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s ;
        while(t-- != 0){
            s = sc.next();
            char[] temp = s.toCharArray();
            if(temp[0] != temp[temp.length-1]){
                if(temp[0] == 'a')
                    temp[temp.length-1] = 'a';
                else
                    temp[temp.length-1] = 'b';
                
            }

            
            s = String.valueOf(temp);
            System.out.println(s);
        
        }
    }
}