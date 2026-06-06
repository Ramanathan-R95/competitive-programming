import java.util.Scanner;
public class NotDivide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            boolean flag = false;
            int[] result = new int[n];
            for(int j=0;j<n;j++){
                result[j] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(result[i] == 1)
                    result[i] += 1;
            }
            for(int i=0;i<n-1;i++){
                if(result[i+1] % result[i] == 0){
                    result[i+1]++;
                }

                

                
            }

           
            
            for(int i : result){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}