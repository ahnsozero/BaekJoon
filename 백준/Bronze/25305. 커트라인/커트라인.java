import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성
        
        int n = sc.nextInt(); // 참가자 n명 입력받기
        int k = sc.nextInt(); // k등 입력받기
        
        int[] arr = new int[n]; // n명의 배열 선언
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // n개의 배열에 참가자 점수 입력받기
        } 
        Arrays.sort(arr); // 오름차순으로 정렬
        System.out.println(arr[n-k]);
        sc.close(); // 자원반납
    }
}