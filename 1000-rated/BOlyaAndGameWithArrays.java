import java.util.*;

public class BOlyaAndGameWithArrays {
    public static int getSecondMin(int[] arr, int min){
        int result = Integer.MAX_VALUE;
        int count = 0;
        for(int i:arr){
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
            int[] firstMin = new int[n];
            int[] secondMin = new int[n];
            List<int[]> matrix = new ArrayList<>();
            for(int i=0;i<n;i++){
                int l = sc.nextInt();
                int[] elements = new int[l];
                int min = Integer.MAX_VALUE;
                for(int j=0;j<l;j++){
                    elements[j] = sc.nextInt();
                    min = min < elements[j] ? min : elements[j];

                }
                firstMin[i] = min;
                secondMin[i] = getSecondMin(elements, min);
                matrix.add(elements);
            }
            int secMinimum = getSecondMin(secondMin, Integer.MIN_VALUE);
            int firstMinimum = getSecondMin(firstMin, Integer.MIN_VALUE);
            int result = 0;
            for(int i:secondMin)
                result+=i;
            result -= secMinimum;
            result += firstMinimum;
            System.out.println(result);





        }
        sc.close();
    }
    
}
