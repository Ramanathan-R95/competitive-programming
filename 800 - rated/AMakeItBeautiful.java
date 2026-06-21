import java.util.Scanner;;
public class AMakeItBeautiful {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int temp;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[j] > arr[i] ){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                    }
                }
            }
            if(arr[0] == arr[n-1]){
                System.out.println("NO");
            }
            else{
                if(arr[0] == arr[1]){
                    temp = arr[0];
                    arr[0] = arr[n-1];
                    arr[n-1] = temp;
                }
                System.out.println("YES");
                for(int i:arr) System.out.print(i+" ");
                System.out.println();
            }
        }
    }

    
}
