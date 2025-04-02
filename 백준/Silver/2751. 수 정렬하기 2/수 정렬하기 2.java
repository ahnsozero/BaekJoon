import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        StringBuilder sb = new StringBuilder(); // 시간초과때문에 속도빠른 SpringBuilder 선언
        
        int n = sc.nextInt(); // 사용자한테 배열 크기 n값 입력받기
        
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList 선언
        
        for(int i=0; i<n; i++) {
            int userInput = sc.nextInt(); // 배열에 사용자 입력값 대입
            list.add(userInput);
        }
        
        Collections.sort(list); // ArrayList 오름차순 정렬
        
        // SpringBuilder에 list값 대입
        for(int value : list) {
            sb.append(value).append('\n');
        }  
        System.out.println(sb);
    }
}