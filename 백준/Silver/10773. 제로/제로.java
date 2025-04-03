import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = -1; // 마지막 원소의 위치를 가리키는 변수
        
        int k = sc.nextInt(); // 입력 개수
        int[] arr = new int[k]; // k개의 배열 선언
        
        for(int i=0; i<arr.length; i++) {
            int num = sc.nextInt(); // 사용자로부터 정수 입력
            
            if (num == 0) { // 입력값 0이라면 top 위치에 있는 원소를 0으로 초기화
                arr[top] = 0;
                top--; // top이 가리키는 위치 1 감소
            } else {
                
                arr[++top] = num; // top 위치 1 증가, 입력받은 정수 대입
            }
        }
        int sum = 0;
        for(int value : arr) {
            sum += value;
        }
        System.out.println(sum);
    }
}