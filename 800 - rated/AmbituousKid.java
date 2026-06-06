import java.util.Scanner ;
public class AmbituousKid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] nums = new int[n] ;
        int result ;
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt() ;

        }
        result = Math.abs(nums[0] );
        for (int i:nums) 
            result = result < Math.abs(i) ? result : Math.abs(i) ;
        System.out.println(result) ;
    }
}