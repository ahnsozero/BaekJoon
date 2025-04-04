import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
        // ArrayList가 아닌 LinkedList를 쓰는 이유는 poll()로 맨앞의 문자를 제거하면
        // 나머지 모든 문자를 맨앞으로 당기는 연산이 필요하기 때문에 성능차원에서 LinkedList가 더 좋다
		
		int N = in.nextInt(); // 1 ~ n까지 수
		int K = in.nextInt(); // k번째
		
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		/*
		 *  마지막 부분의 출력은 > 괄호 전에 공백이 없기 때문에
		 *  일괄적으로 출력하기 위해 마지막 원소만 남겨질 때까지만
		 *  반복하고 마지막 원소는 그대로 출력한다.
		 */
		while(q.size() > 1) {
			
			for(int i = 0; i < K - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}
			
			sb.append(q.poll()).append(", ");
		}
 
		// 마지막 원소 출력한 뒤 > 도 붙여준다.
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
 
}