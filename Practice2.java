import java.io.*;
public class Practice2 {
  public static void main(String[] args) throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String s = br.readLine();
    // BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
    // String  s = br.readLine();    // 1行分の文字列を入力する
    // int     n = Integer.parseInt( s );    // 文字列から数値を得る

    // 練習問題2-1
    // BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
    // String ss = string.readLine();
    // System.out.println(ss);
    // 練習問題2-2
    // int x;
    // BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
    // String s = num.readLine();
    // x = Integer.parseInt(s);
    // System.out.println(x);
    // 練習問題 2-3
    // int x;
    // BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
    // String s = num.readLine();
    // x = Integer.parseInt(s);
    // System.out.println(x);
    // System.out.println(x * x);
    // System.out.println(x * x * x);
    // 練習問題 2-4
    // int x, y;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // x = Integer.parseInt(br.readLine());
    // y = Integer.parseInt(br.readLine());
    // System.out.println(x + y);
    // System.out.println(x - y);
    // System.out.println(x * y);
    // System.out.println(x / y);
    // System.out.println(x % y);
    // 練習問題 2-5
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x,y;
    // x = Integer.parseInt(br.readLine());
    // y = Integer.parseInt(br.readLine());
    // System.out.println( (x + y) / 2);
    // 練習問題 2-6

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x;
    System.out.println("年齢を入力してください");
    x = Integer.parseInt(br.readLine());
    System.out.println(x * 365);
  }
}