import java.util.Scanner;
public class Beautiful{
    public static int gcd(int a , int b){
        while(b !=0){
            int t = b;
            b = a % b ;
            a = t;
        }
        return a;
    }



    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean temp = false;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1) temp = true;
            }
            if(temp){
                System.out.println("YES");
            }
            else{
                for(int i=0;i<n;i++){
                    for(int j = i+1; j < n ; j++){
                        int p = gcd(arr[i],arr[j]);
                        if(p<=2){
                            temp = true;
                            break;
                        }
                    }
                    if(temp) break;
                }
                if(temp)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }


        }


    }
}