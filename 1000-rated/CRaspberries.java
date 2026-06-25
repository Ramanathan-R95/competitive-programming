import java.util.Scanner;

public class CRaspberries{
    public static int cal(int[] arr, int k){
        int result = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            result = Math.min(result , k - ((arr[i] % k) == 0? k : arr[i] % k));

        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            if(k == 5 || k == 3 || k == 2)
                System.out.println(cal(arr, k));
            
            else{
                int result = cal(arr, k);
                int count = 0;
                for(int i:arr){
                    if(i % 2 == 0)
                        count++;
                }
                if(count == 0)
                    result = Math.min(result,2);
                else if(count > 1)
                    result = Math.min(result , 0);
                else
                    result = Math.min(result , 1);

                System.out.println(result);

            }


        }
        sc.close();
    }
}



// 2
// 2
// 1
// 0
// 2
// 1
// 1
// 2
// 0
// 1
// 1
// 4
// 0
// 4
// 3