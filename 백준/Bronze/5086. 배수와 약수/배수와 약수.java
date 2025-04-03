import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        
        while(true) {
            int first = sc.nextInt();
		    int second = sc.nextInt();
            
            // 만약 두 입력값, 0이 들어온다면 반복문 탈출
            if(first == 0 && second == 0) break;
            
            if(second % first == 0) {
                System.out.println("factor");
            }
            else if(first % second == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }	
        } 
	}
}