import java.util.*;
public class Chemistry{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            sc.nextLine();
            String s = sc.nextLine();
            Map<Character,Integer> m = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                char c = s.charAt(i);
                m.put(c,m.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer> e : m.entrySet()){
                if(e.getValue() % 2 == 1) count++;

            }
            
            if(count <= k + 1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}