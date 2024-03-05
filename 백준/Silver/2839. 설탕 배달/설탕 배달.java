import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();
    	int sum = 0;
    	
    	while(true) {
    		if(num % 5 == 0) {
    			sum += num / 5;
    			System.out.println(sum);
    			break;
    		}else {
    			num -= 3;
    			sum++;
    		}
    		if(num < 0) {
    			System.out.println("-1");
    			break;
    		}
    	}
    }
    
}