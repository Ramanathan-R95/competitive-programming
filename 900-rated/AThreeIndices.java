import java.util.Scanner;
public class AThreeIndices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean res = false;
            for(int i=0;i<n;i++ ){
                arr[i] = sc.nextInt();
            }
            for(int i = 1 ; i < n - 1 ; i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.println("YES");
                    System.out.println(i +" " + (i + 1)+" "+ (i+2));
                    res = true;
                    break;
                }
            }
            if(!res) System.out.println("NO");

        }
    }
}
