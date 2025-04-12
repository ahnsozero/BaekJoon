import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[9][9]; // 9X9 행렬
        int max = 0; // 최대값 초기화
        int x=1; // 1행
        int y=1; // 1열
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }    
        }
        System.out.println(max); 
        System.out.println(x + " " + y);
    }
}