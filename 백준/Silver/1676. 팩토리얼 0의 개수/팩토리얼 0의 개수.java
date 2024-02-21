import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt(); 
    	int count = 0;

        for(int i = 1; i <= n; i++){
            int num = i;
            while(num % 5 == 0){
                count++;
                num /= 5;
            }
        }
        System.out.println(count);
    }
}