import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	StringTokenizer st = new StringTokenizer(sc.nextLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int high = (V - B) / (A - B);
		if((V - B) % (A - B) != 0) high++;
		System.out.println(high);
        
        sc.close();
    }    
}