import java.util.Scanner;
public class BLuntikAndSubsequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            long [] arr = new long[n];
            int zCount = 0;
            int oneCount = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(arr[i] == 0) zCount++;
                else if(arr[i] == 1) oneCount++;
            }
            System.out.println((long)(Math.pow(2,zCount)*oneCount));
        }
    }
}