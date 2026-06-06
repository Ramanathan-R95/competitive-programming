import java.util.*;
public class SequenceGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while(t-- != 0 ) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            ArrayList<Integer> result = new ArrayList<>();
            sc.nextLine() ;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt() ;
            }
            result.add(nums[0]);

            for(int i=1;i<n;i++){
                if(nums[i-1] <= nums[i] ) 
                    result.add(nums[i]);
                else{
                    result.add(nums[i]);
                    result.add(nums[i]);


                }
            }
            System.out.println(result.size());
            for(int i=0;i<result.size();i++){
                System.out.print(result.get(i)+" ");
            }
            System.out.println();

        }
    }
}