import java.util.* ;

public class ReversePermutation {
    public static void reverse(int [] nums , int st , int end ){
        int l = (end - st + 1) / 2;
        int temp;
        for(int i = 0 ; i < l ; i++){
            temp = nums[st] ;
            nums[st] = nums[end] ;
            nums[end] = temp ;
            st++ ;
            end-- ;
        }


    }
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in) ;
        int t ;
        int n ;

        t = sc.nextInt() ;
        while(t-- > 0){
            n = sc.nextInt() ;
            int []nums = new int[n] ;
            for (int i = 0 ; i < n ; i++) 
                nums[i] = sc.nextInt() ;
            for(int i = 0 ; i < n ; i ++) {
                if(nums[i] != n - i ){
                    int end = -1;
                    for(int j = i + 1 ; j < n ; j++){
                        if ( nums[j] == n - i){
                            end = j ;
                            break ;
                        }
                    }
                    reverse(nums,i , end) ;
                    break ;
                }

            }
            for(int i : nums) System.out.print(i +" ") ;
            System.out.println() ;

        }
    }
}