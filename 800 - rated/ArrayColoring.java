import java.util.Scanner ;

public class ArrayColoring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int oddCount;
        int evenCount;
        int temp;
        while(t-- != 0){
            oddCount = 0;
            evenCount = 0;

            n = sc.nextInt();
            for(int i=0;i<n;i++){
                temp = sc.nextInt();
                if(temp % 2 == 0) evenCount++;
                else oddCount++;

            }
            if(oddCount == 1 && evenCount==1) System.out.println("NO");
            else if(oddCount == 0) System.out.println("YES");
            else if(evenCount==0){
                if(oddCount % 2 == 0) System.out.println("YES");
                else System.out.println("NO");
            }
            else if(oddCount == 1) System.out.println("NO");
            else if(oddCount % 2 == 0)System.out.println("YES");
            else System.out.println("NO");

            
            
        }
    }
}