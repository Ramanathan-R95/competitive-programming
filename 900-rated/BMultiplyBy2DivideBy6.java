import java.util.Scanner;

public class BMultiplyBy2DivideBy6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        long temp;

        while(t-- != 0){
            long threeCount = 0;
            long twoCount = 0;
            n = sc.nextLong();
            temp = n;
            while(temp % 2 == 0){
                twoCount++;
                temp = temp/2;

            }
            while(temp % 3 == 0){
                threeCount++;
                temp = temp/3;
            }

            if(temp > 1 || twoCount > threeCount){
                System.out.println(-1);
            }
            else {
                System.out.println(threeCount + (threeCount - twoCount));
            }

            
        }
    }
}
