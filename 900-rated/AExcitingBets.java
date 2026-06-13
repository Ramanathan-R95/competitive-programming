import java.util.Scanner;

public class AExcitingBets {
    public static int gcd(int a, int b){
        int temp  = b;
        while(b > 0){
            temp = b;
            b = a % b;
            a = temp ;
        }
        return a;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println(gcd(18,16));
        int t = sc.nextInt();
        while(t-- != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long d;
            if(a == b){
                System.out.println("0 0");
            }
            else{

                d = Math.abs(a - b);
                System.out.println(d + " " + Math.min(b % d,d - (b % d)));
            }

        }
        sc.close();
    }
    
}
