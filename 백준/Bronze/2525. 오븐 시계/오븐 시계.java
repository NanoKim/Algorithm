import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      int temp = A * 60 + B + C;
      
      int hour = (temp/60) % 24;
      int minute = temp % 60;

      System.out.print(hour + " " + minute);
   }
}