import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.nextLine().toCharArray(); // 사용자한테 값 입력받아서 배열로 대입
        
        Arrays.sort(arr); // 입력받은값 오름차순 정렬
        
        for(int i=arr.length -1; i >=0; i--) { // 오름차순 배열 큰수부터 출력
            System.out.print(arr[i]);
        }
    }
}