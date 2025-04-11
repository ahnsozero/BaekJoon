import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 부모 노드를 저장할 배열
        int[] parent = new int[n+1];
        boolean[] visited = new boolean[n+1];
        
        // 인접리스트 만들기
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            adj[i] = new ArrayList<>();
        }
        // 트리의 모든 간선 입력받기(n-1), 인접리스트 구성
        for(int i=1; i<n; i++) { 
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        // BFS를 위한 큐
        Queue<Integer> queue = new LinkedList<>(); //ArrayList를 쓰면, 요소를 poll할 때마다 O(n) 시간이 들 수 있으므로 성능이 저하
        queue.add(1); // 루트 노드 1번을 시작점으로
        visited[1] = true; // 1번 노드 방문 처리
        
        while (!queue.isEmpty()) { //큐가 빌때까지 반복
            int cur = queue.poll(); // 큐에서 현재 노드 하나를 뽑기 
            for(int i : adj[cur]) { // 현재 노드와 인접한 노드들 뽑기
                if(visited[i]) {
                    continue; // 방문한적 있다면 건너뛰기
                }
                // 방문한적 없다면
                visited[i] = true; // 방문 처리
                queue.add(i); // 큐에 넣기
                parent[i] = cur; // i노드의 부모는 cur 노드
            } 
        }
        // 부모 노드를 출력(1번 노드는 루트 노드이므로 부모가 없다.)
        for (int i = 2; i <= n; i++) {  
            System.out.println(parent[i]);  
        }  
    }
}