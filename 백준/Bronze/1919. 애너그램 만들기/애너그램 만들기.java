import java.util.Scanner;

// 두 단어를 애너그램으로 만들기 위해 제거해야하는 문자의 최소 개수 구하기
class Main {

    // 애너그램: 단어의 구성(알파벳과 그 갯수)이 완전히 같은 단어

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 첫번째 단어 입력
        String b = sc.next(); // 두번째 단어 입력

        int[] countA = new int[26]; // 알파벳 갯수 a ~ b
        int[] countB = new int[26];
        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) - 'a']++; // 각 입력받은 단어 갯수 세기
        }
        for (int i = 0; i < b.length(); i++) {
            countB[b.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            // 만약 a의 단어가 b의 단어보다 많다면
            if (countA[i] > countB[i]) {
                ans += countA[i] - countB[i];
            } else if (countB[i] > countA[i]) {// 만약 b의 단어가 a의 단어보다 많다면
                ans += countB[i] - countA[i];
            }
        }
        System.out.println(ans); // 두 문자열을 애너그램으로 만들기 위해 제거해야하는 최소갯수
    }
}
