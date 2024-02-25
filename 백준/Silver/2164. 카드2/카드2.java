import java.io.IOException;
import java.util.*;

public class Main {
	
	static Queue<Integer> qu = new LinkedList<>();
	static LinkedList<int[]> sarr;
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
        	qu.add(i);
        }
        
        while(qu.size() > 1) {
        	qu.poll();
        	qu.add(qu.poll());
        }
        
        System.out.println(qu.peek());
        
    }    
}