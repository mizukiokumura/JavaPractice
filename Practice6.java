import java.io.*;
public class Practice6 { 
  public static void main(String[] args) throws IOException {
    // 練習問題 6-1
    // int num = 3;
    // System.out.println(zizyou(num));
    // 練習問題 6-2
    // int x,y;
    // x = 4;
    // y = 3;
    // int xy = heikin(x, y);
    // System.out.println(xy);
    // 練習問題 6-3;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // int y = Integer.parseInt(br.readLine());
    // int z = Integer.parseInt(br.readLine());
    // System.out.println( MaxValue(x,MaxValue(y,z)));
    // 練習問題 6-4l
    //  int x = 3;
    //  int y = 4;
    //  int z = 5;
    //  Triangle(x);
    //  Triangle(y);
    //  Triangle(z);
    // 練習問題 6-5;
    // int x = 3;
    // char s = '女';
    // int y = 4;
    // char o = '男';
    // int z = 5;
    // char k = '陣';
    // CharTriangle(x, s);
    // CharTriangle(y, o);
    // CharTriangle(z, k);
    // 練習問題 6-6;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // kuKu(x);
  }
  // 練習問題 6-1
  // public static int zizyou(int num) {
  //   int seki;
  //   System.out.println(seki=  num * num);
  //   return seki;
  // }
  // public static void main( String[] args )
  // {
  //     System.out.println( "3の2乗=" + pow2( 3 ) );
  // }

  // static int pow2( int n )
  // {
  //     return n * n;
  // }
  // 練習問題 6-2;
  // public static int heikin(int n ,int x) {
  //   int nx = n + x / 2;
  //   return nx;
  // }
  // public static void main( String[] args )
  // {
  //     System.out.println( "4と9の平均=" + average( 4, 9 ) );
  // }

  // static int average( int x, int y )
  // {
  //     return ( x + y ) / 2;
  // }
  // 練習問題 6-3;
  // static int MaxValue(int n1, int n2) {
  //   if(n1 > n2) {
  //     return n1;
  //   } else {
  //     return n2;
  //   }
  // }
  // 練習問題 6-4;
  // static void Triangle(int n) {
  //   for(int i = 0; i < n; i ++) {
  //     int a = i + 1;
  //     for(int u = 0; u < a; u ++) {
        
  //       System.out.print("$");
  //     }
  //     System.out.println("");
  //   }
  //   System.out.println("");
  // }
  // 練習問題 6-5;
  // static void CharTriangle(int x, char s) {
  //   for(int i = 0; i < x; i++) {
  //     int n = i + 1;
  //     for(int u = 0; u < n; u++) {
  //       System.out.print(s);
  //     }
  //     System.out.println("");
  //   }
  //   System.out.println("");
  // }
  // 練習問題 6-6;
  // static void kuKu(int x) {
  //   for(int i = 0; i < 9; i++) {
  //     int n = i + 1;
  //     int u = x * n;
  //     System.out.println(u);
  //   }
  // }
}