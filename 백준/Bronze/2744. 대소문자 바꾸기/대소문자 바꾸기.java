import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        String str = sc.nextLine(); // 입력값 받기

        for (int i = 0; i < str.length(); i++) {
            // 대문자라면
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                // 대문자 'A'로부터 몇번째 떨어져있는지 값 찾아서 소문자 'a'에 값 더하기
                System.out.print((char)('a' + str.charAt(i) - 'A'));
            } else { //소문자라면
                // 소문자 'a'로부터 몇번째 떨어져있는지 값 찾아서 대문자 'A'에 값 더하기
                System.out.print((char)('A' + str.charAt(i) - 'a'));
            }
        }
    }
}