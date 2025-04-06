import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // n개의 줄
        
        // 반복적으로 출력해야하는 문제들은  println()보다 한 번에 묶어서 출력해주는 것이 훨씬 성능이 좋다.
        StringBuilder sb = new StringBuilder(); 
        
        for(int i=0; i<n; i++) {
            int A = sc.nextInt(); // A값 입력
            int B = sc.nextInt(); // B값 입력
            
            int d = gcd(A, B); // 최대공약수
            
            sb.append(A*B/d).append('\n');
        }
        System.out.println(sb); // 모든 라인 출력
    }
    // 최대공약수 구하기 (greatest common divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; 
                
            // GCD(a, b) = GCD(b, r)로 변환
            a = b;
            b = r;
        }
         return a;
    }
}