import java.util.*;

public class BOlyaAndGameWithArrays {
    public static long getSecondMin(long[] arr, long min){
        long result = Integer.MAX_VALUE;
        long count = 0;
        for(long i:arr){
            if(i < result && i > min)
                result = i;
            if(i == min) 
                count++;
        }
        if(count > 1)
            return min;
        return result;
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            long[] firstMin = new long[n];
            long[] secondMin = new long[n];
            List<long[]> matrix = new ArrayList<>();
            for(int i=0;i<n;i++){
                int l = sc.nextInt();
                long[] elements = new long[l];
                long min = Integer.MAX_VALUE;
                for(int j=0;j<l;j++){
                    elements[j] = sc.nextLong();
                    min = min < elements[j] ? min : elements[j];

                }
                firstMin[i] = min;
                secondMin[i] = getSecondMin(elements, min);
                matrix.add(elements);
            }
            long secMinimum = getSecondMin(secondMin, Integer.MIN_VALUE);
            long firstMinimum = getSecondMin(firstMin, Integer.MIN_VALUE);
            long result = 0;
            for(long i:secondMin)
                result+=i;
            result -= secMinimum;
            result += firstMinimum;
            System.out.println(result);





        }
        sc.close();
    }
    
}
