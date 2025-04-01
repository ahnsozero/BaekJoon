import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        
        int N = sc.nextInt(); // 사용자한테 배열 크기 N값 입력받기
        int[] arr = new int[N];
        
        for(int i=0; i < N; i++) {
            arr[i] = sc.nextInt(); // 사용자한테 배열에 값 입력받기
        }
        
        // 선택정렬(최소값 찾아서 정렬)
        for(int i = 0; i < N - 1; i++) {
            for(int j=i+1; j < N; j++){
                if(arr[i] > arr[j]) {
                    int tmep = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmep;
                }
            }
        }
        // 향상된 for문으로 arr배열 출력
        for(int val : arr) {
            System.out.println(val);
        }
    }
}