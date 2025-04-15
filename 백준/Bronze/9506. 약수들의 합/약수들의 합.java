import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            int n = sc.nextInt(); // 숫자 입력받기
            
            if(n == -1) {
                break;
            }

            int[] array = new int[n];
            
            int sum = 0;
            for(int i=1; i<=n; i++) { 
                if(n%i == 0 && i != n) { // n의 약수구하기
                    array[i] = i;
                    sum += i; // 약수 합하기
                }
            }
            
             //완전수가 아닐 경우
            if (sum != n) { //다른 것과 구분하려면 앞으로 빼는 것이 나음!
                sb.append(n+ " is NOT perfect. \n");
                continue; //완전수가 아니기때문에 while문 탈출
            }
            // 약수들의 합 n과 같다면 완전수
            sb.append(n + " = 1"); //1의 약수는 무조건 추가

            for(int i=1; i<n; i++) {
                if(array[i] != 0 && array[i] != 1) { // 숫자 출력 1 생략
                    sb.append(" + " + array[i]);
                }
            }
            sb.append("\n");
          }
          System.out.println(sb);
        }
    }