import java.util.* ;

public class DoremyPaint{
    public static void main(String[] args){
        int t ;
        Scanner sc = new Scanner(System.in) ;
        t = sc.nextInt() ;
        while (t-- != 0){
            int n = sc.nextInt() ;
            int[] arr = new int[n] ;
            HashMap<Integer,Integer> freq = new HashMap<>() ;

            for (int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
                freq.put(arr[i] , freq.getOrDefault(arr[i],0) + 1) ;

            }
            switch (freq.size()){
                case 1 :
                    System.out.println("YES") ;
                    break ;
                case 2 :
                    Collection<Integer> values = freq.values() ;
                    Iterator<Integer> val = values.iterator() ;
                    int n1 = val.next() ;
                    int n2 = val.next() ;
                    if(n % 2 == 0) {
                        
                        if(n1 == n2) System.out.println("YES") ;
                        else System.out.println("NO") ;
                    }
                    else {
                        if(Math.abs(n1 - n2) == 1) System.out.println("YES") ;
                        else System.out.println("NO") ;
                    }
                    break ;
                default :
                    System.out.println("NO") ;
            }

        }


    }
}