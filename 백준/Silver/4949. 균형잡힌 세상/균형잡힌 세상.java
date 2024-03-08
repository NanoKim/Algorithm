import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<String> stack = new Stack<>();

            String[] arr = str.split("");
            for(String s : arr){
                switch (s) {
                    case ("("):
                    case ("["):
                        stack.push(s);
                        break;
                    case (")"):
                        if(!stack.isEmpty() && stack.peek().equals("("))
                            stack.pop();
                        else stack.push(")");
                        break;
                    case ("]"):
                        if(!stack.isEmpty() && stack.peek().equals("["))
                            stack.pop();
                        else stack.push("]");
                        break;
                }
            }

            if (stack.empty())
                bw.write("yes\n");
            else
                bw.write("no\n");

            bw.flush();
        }
    }
    
}