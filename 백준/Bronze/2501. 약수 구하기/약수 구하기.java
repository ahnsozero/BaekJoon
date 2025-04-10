import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }
        
        int result = 0;
        if(list.size() >= k){
            result = list.get(k-1);
        } 
        System.out.print(result);
    }
}