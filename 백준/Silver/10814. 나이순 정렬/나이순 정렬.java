import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
        
        for(int i=0; i < n; i++) {
            arr[i][0] = sc.next(); // 나이
            arr[i][1] = sc.next(); // 이름
        }
        
        Arrays.sort(arr, new Comparator<String[]>() { // 익명클래스 선언
            // 나이순으로 오름차순 정렬
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            } // 나이 s1 - s2의 수가 양수가 나온다면 s1이 더 큰 수이므로 자리 교체,
            // 만약 0이 나온다면 같은 나이이므로 자리교체 없이 입력순으로 정렬 
        });
        
        for(int i=0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}