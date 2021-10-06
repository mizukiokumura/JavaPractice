import java.io.*;
public class Practice3 {
  public static void main(String[] args) throws IOException {

    // 練習問題 3-1
    // int x, y;
    // x = 8;
    // y = 7;
    // if (x > y) {
    //   System.out.println("xはyより大きい");
    // }
    // 練習問題 3-2;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // int y = Integer.parseInt(br.readLine());
    // if (x > y) {
    //   System.out.println(x);
    // } else {
    //   System.out.println(y);
    // 練習問題 3-3;
    // int x,y;
    // x = 30;
    // y = 20;
    // if (x > y) {
    //   System.out.println("xはyより大きい");
    // } else {
    //   System.out.println("xはyより小さい");
    // }
    // 練習問題 3-4;
    // int x, y;
    // x = 15;
    // y = 15;
    // if (x == y) {
    //   System.out.println("xとyは等しい");
    // } else if ( x > y) {
    //   System.out.println("xはyより大きい");
    // } else {
    //   System.out.println("xはyより小さい");
    // }
    // 練習問題 3-5;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // if (x % 2 == 0 ) {
    //   System.out.println("偶数です");
    // } else {
    //   System.out.println("奇数です");
    // 練習問題 3-6;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // if (x >= 0 && x % 2 == 0) {
    //   System.out.println("正の偶数です");
    // } else if (x >= 0 ) {
    //   System.out.println("正の奇数です。");
    // } else if (x <= 0 && x % 2 == 0) {
    //   System.out.println("負の偶数です");
    // } else {
    //   System.out.println("負の奇数です");
    // }
    // 練習問題 3-7;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // if ( x >= 60) {
    //   System.out.println("合格");
    // } else {
    //   System.out.println("不合格");
    // }
    // if ( x >= 80) {
    //   System.out.println("大変良くできました");
    // } else if (x >= 60 ) {
    //   System.out.println("良くできました。");
    // } else {
    //   System.out.println("残念でした。");
    // }
    // if (x >= 80) {
    //   System.out.println("”優“");
    // } else if ( x >= 70) {
    //   System.out.println("”良“");
    // } else if ( x >= 60) {
    //   System.out.println("”可“");
    // } else {
    //   System.out.println("”不可“");
    // }
    // 練習問題 3-8 ;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int middleScore = Integer.parseInt(br.readLine());
    // int lastScore = Integer.parseInt(br.readLine());
    // if (middleScore >= 60  && lastScore >= 60 ) {
    //   System.out.println("合格");
    // } else if ((middleScore + lastScore) >= 130) {
    //   System.out.println("合格");
    // }else if ((middleScore + lastScore) >= 100 && lastScore >= 90 || middleScore >= 90) {
    //   System.out.println("合格");
    // } else {
    //   System.out.println("不合格");
    // }
    // 練習問題 3-9;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int day = Integer.parseInt(br.readLine());
    // int zikan = Integer.parseInt(br.readLine());
    // if (day == 0 ) {
    //   System.out.println("休診");
    // } else if (day == 6 && zikan >= 1) {
    //   System.out.println("休診");
    // } else if (day == 2 && zikan == 0) {
    //   System.out.println("休診"); 
    // } else if (day == 3 && zikan == 2) {
    //   System.out.println("休診");
    // } else if (day == 5 && zikan == 0) {
    //   System.out.println("休診");
    // } else {
    //   System.out.println("OK");
    // }
    // 練習問題 3-10;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = Integer.parseInt(br.readLine());
    // int y = Integer.parseInt(br.readLine());
    // if (x < y && x % 2 == 0 && y % 2 == 0) {
    //   System.out.println("xはyより小さく、かつ、xとyはともに偶数である。");
    // } else if (x == y && x < 0 && y < 0) {
    //   System.out.println("xとyは等しく、かつ、負の数である。");

    // } else if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
    //   System.out.println("xはyより小さい、または、xは偶数である。");
    // } else if ((x < y) || (x % 2 == 0)) {
    //   System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
    // } else if (x >= 0 && y >= 0) {
    //   System.out.println("xもyも負の数ではない");
    // } else {
    //   System.out.println("xもyも負の数である");
    // }
    // BufferedReader br = new BufferedReader(
    //                     new InputStreamReader( System.in ) );

    // int x = Integer.parseInt( br.readLine() );
    // int y = Integer.parseInt( br.readLine() );

    // if( x < y && ( x % 2 ) == 0 && ( y % 2 ) == 0 )
    //     System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

    // if( x == y && x < 0 )
    //     System.out.println( "xとyは等しく、かつ、負の数である。" );

    // if( x < y || ( x % 2 ) == 0 )
    //     System.out.println( "xはyより小さい、または、xは偶数である。" );

    // if( ( x <= 10 || x >= 100 ) && ( y >= 10 && y <= 100 ) )
    //     System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

    // if( ! ( x < 0 && y < 0 ) )
    //     System.out.println( "xもyも負の数である、ではない。" );
  }
}