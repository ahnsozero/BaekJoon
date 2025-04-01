import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 합계 초기화
        int[] arr = new int[5]; // 5개의 배열 선언
        for (int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 배열에 값 입력받기
            sum += arr[i]; // 배열의 합계 구하기
        }
        Arrays.sort(arr); // 배열 오름차순으로 정렬
        int avg = sum/arr.length; //평균 구하기
        System.out.println(avg); // 평균 출력
        System.out.println(arr[2]); // 배열 중간값 출력
    }
}