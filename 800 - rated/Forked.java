import java.util.*;
public class Forked{
    public static Set<String> genSet(long p , long q , long a , long b ){
        Set<String> res = new HashSet<>();
        long[][] moves = {
            {a, b}, {a, -b}, {-a, b}, {-a, -b},
            {b, a}, {b, -a}, {-b, a}, {-b, -a}
        };
        for(long[] m : moves){
            res.add((m[0] + p) + " " + (m[1] + q) );

        }
        return res;


    }
    public static void main(String[] args){
        int t ;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt() ;
        while(t-- != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long p = sc.nextLong();
            long q = sc.nextLong();
            long r = sc.nextLong();
            long s = sc.nextLong();
            Set<String> s1 = genSet(p,q,a,b);
            Set<String> s2 = genSet(r,s,a,b);
            s1.retainAll(s2);
            System.out.println(s1.size());





        }
        
    }
}