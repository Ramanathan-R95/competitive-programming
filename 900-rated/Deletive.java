import java.util.*;
public class Deletive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0){
            String s = sc.next();
            char[] s1 = s.toCharArray();
            String t = sc.next();
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0;i<t.length();i++){
                char ch = t.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else 
                    map.put(ch,1);
            }
            for(int i=s1.length - 1 ;i>=0;i--){
                
                if(map.containsKey(s1[i])){
                    int freq = map.get(s1[i]);
                    if(freq > 0){
                        map.put(s1[i],freq - 1);
                    }
                    else{
                        s1[i] = '@';

                    }

                }
                else{
                    s1[i] = '@';
                }
            }
            String result = "";
            for(char c :s1){
                if(c != '@'){
                    result += String.valueOf(c);
                }
            }
            if(t.equals(result)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}