import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 동전의 종류 갯수
        int k = sc.nextInt(); // 돈 입력받기
        
        int[] coin = new int[n];
        
        for(int i=0; i<n; i++) {
            coin[i] = sc.nextInt(); // 동전종류 오름차순으로 입력받기
        }
        
        int count = 0;
        for(int i=n-1;i >=0; i--) { // 동전 큰순부터(내림차순)
            if(coin[i] <= k) { // 동전가치가 입력받은 돈보다 작거나 같을때만
                count += (k/coin[i]); //동전가치 count++
                k = k % coin[i]; // 입력받은돈 동전가치로 나누고 남은 돈
            }
        }
        System.out.println(count);
    }
}