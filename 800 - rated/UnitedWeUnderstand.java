import java.util.*;
public class UnitedWeUnderstand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            int minVal = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
                minVal = Math.min(minVal,nums[i]);
            }
            for(int i: nums){
                if(i == minVal) b.add(i);
                else c.add(i);  
            }
            if(c.size()==0) System.out.println(-1);
            else{
                System.out.println(b.size()+" "+c.size());
                for(int i=0;i<b.size();i++) System.out.print(b.get(i)+" ");
                System.out.println();
                for(int i=0;i<c.size();i++) System.out.print(c.get(i)+" ");
                System.out.println();

            }
        }
    }
}