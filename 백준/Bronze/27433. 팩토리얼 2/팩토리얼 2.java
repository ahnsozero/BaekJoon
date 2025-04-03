import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 스트림생성
        
        int n = Integer.parseInt(br.readLine()); // N값 입력받아서 int형으로 변환
        br.close(); //자원반납
        System.out.println(factorial(n)); // 재귀함수 호출
    }
    
    static long factorial(int n) {
        if(n <= 0) return 1;
        return n*factorial(n-1);
    }
}