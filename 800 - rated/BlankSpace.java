import java.util.Scanner;

public class BlankSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int result = 0;
            int[] arr = new int[n];
            for(int i = 0;i < n ; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n ; i++){
                if(arr[i] == 0){
                    int temp = i;
                    while(temp < n && arr[temp] == 0 ){
                        temp++;
                    }
                    result = Math.max(result , temp - i );

                }
            }
            System.out.println(result);

        }
        
    }
}