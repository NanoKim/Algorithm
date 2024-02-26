import java.io.IOException;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int room = 1;
        int search = 2;

        if(n == 1) {
            System.out.print(room);
        }else{
            while(search <= n) {
            	search = search + (6 * room);
                room++;
            }
            System.out.print(room);
        }
    }    
}