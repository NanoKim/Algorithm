import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	
        String n = br.readLine();

        if(n.length() % 3 == 1)
            sb.append(n.charAt(0));

        if(n.length() % 3 == 2)
            sb.append((n.charAt(0) - '0') * 2 + (n.charAt(1) - '0'));

        for(int i = n.length() % 3; i < n.length(); i+=3) {
            sb.append((n.charAt(i) - '0') * 4 + (n.charAt(i+1) - '0') * 2
                    + (n.charAt(i+2) - '0'));
        }
        
        System.out.println(sb);
    }    
}