import java.util.Scanner;
public class BMakeItDivisibleBy25{
    public static int solve(String s , char a , char b){
        int l = s.length();
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i) == b){
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(j) == a)
                        return l-i-1 + i-j-1;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String s = sc.next();
            int result;
            result = Math.min(solve(s,'0','0'),solve(s,'2','5'));
            result = Math.min(result,solve(s,'5','0'));
            result = Math.min(result,solve(s,'7','5'));
            System.out.println(result);



        }
    }

}