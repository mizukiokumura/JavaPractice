import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice7 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("整数を入力してください");
    String input = br.readLine();
    String[] param = input.split(" ");
    
    int num1 = Integer.parseInt(param[0]);
    int num2 = Integer.parseInt(param[1]);
    System.out.println(num1 + num2);
  }
}