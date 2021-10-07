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
    //  int x, y;
    //  x = 15;
    //  y = 15;
    //  if (x == y) {
    //    System.out.println("xとyは等しい");
    //  } else if ( x > y) {
    //    System.out.println("xはyより大きい");
    //  } else {
    //    System.out.println("xはyより小さい");
    //  }
    // if( x > y )
    //     System.out.println( "xはyより大きい。" );
    // else if( x < y )
    //     System.out.println( "xはyより小さい。" );
    // else
    //     System.out.println( "xとyは等しい。" );
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
    // if( ( x % 2 ) == 0 ){
    //   if( x >= 0 )
    //       System.out.println( "正の偶数" );
    //   else
    //       System.out.println( "負の偶数" );
    // } else {
    // if( x >= 0 )
    //     System.out.println( "正の奇数" );
    // else
    //     System.out.println( "負の奇数" );
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
    //     boolean bopen = true;

    // if( day == 0 )
    //     bopen = false;
    // else if( zone == 0 && ( day == 2 || day == 5 ) )
    //     bopen = false;
    // else if( zone == 1 && day == 6 )
    //     bopen = false;
    // else if( zone == 2 && ( day == 3 || day == 6 ) )
    //     bopen = false;

    // if( bopen )
    //     System.out.println( "診療しています。" );
    // else
    //     System.out.println( "休診です。" );
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
    // 練習問題 3-11;
    // BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    // int month = Integer.parseInt(br.readLine());
    // switch (month) {
    //   case 1:
    //   System.out.println("元日,成人の日");
    //   break;
    //   case 2:
    //   System.out.println("建国記念日");
    //   break;
    //   case 3:
    //   System.out.println("春分の日");
    //   break;
    //   case 4:
    //   System.out.println("昭和の日");
    //   break;
    //   case 5:
    //   System.out.println("憲法記念日、みどりの日、子供の日");
    //   break;
    //   case 7:
    //   System.out.println("海の日");
    //   break;
    //   case 9:
    //   System.out.println("敬老の日");
    //   break;
    //   case 10:
    //   System.out.println("体育の日");
    //   break;
    //   case 11:
    //   System.out.println("文化の日、勤労感謝の日");
    //   break;
    //   case 12:
    //   System.out.println("天皇誕生日");
    //   break;
    // }
    // 練習問題3-12;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("好きな寿司を入力してください(1:マグロ, 2:サンマ, 3:サーモン, 4:とびっ子, 5:うなぎ");
    // int susi = Integer.parseInt(br.readLine());
    // switch (susi) {
    //   case 1:
    //   System.out.println("マグロを選んだ貴方は、気分屋で適当でしょう");
    //   break;
    //   case 2:
    //   System.out.println("サンマを選んだ貴方は、とても面倒見が良く長女タイプでしょう");
    //   break;
    //   case 3:
    //   System.out.println("サーモンを選んだ貴方は、末っ子肌で、とても甘えたがりでしょう");
    //   break;
    //   case 4:
    //   System.out.println("とびっ子を選んだ貴方は、優しくて芯が強く、とても頼りになる存在でしょう");
    //   break;
    //   case 5:
    //   System.out.println("うなぎを選んだ貴方は、頑固で職人気質なところがあるでしょう。");
    //   break;

    // }
    // 練習問題 3-13;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("日数を確認したい月を入力してください");
    // int month = Integer.parseInt(br.readLine());
    // switch (month) {
    //   case 1:
    //   System.out.println("1月は31日です");
    //   break;
    //   case 2:
    //   System.out.println("2月は28日です");
    //   break;
    //   case 3:
    //   System.out.println("3月は30日です");
    //   break;
    //   case 4:
    //   System.out.println("4月は31日です");
    //   break;
    //   case 5:
    //   System.out.println("5月は30日です");
    //   break;
    //   case  6:
    //   System.out.println("6月は31日です");
    //   break;
    //   case 7:
    //   System.out.println("7月は31日です");
    //   break;
    //   case 8:
    //   System.out.println("8月は30日です");
    //   break;
    //   case 9:
    //   System.out.println("9月は31日です");
    //   break;
    //   case 10:
    //   System.out.println("10月は30日です");
    //   case 11:
    //   System.out.println("11月は31日です");
    //   break;
    //   case 12:
    //   System.out.println("12月は30日です");
    //   break;
    //   default :
    //   System.out.println("入力が間違っています");
    // }
    //     switch( month )
    // {
    //     case 2:
    //         System.out.println( "28日です" );
    //         break;
    //     case 4:
    //     case 6:
    //     case 9:
    //     case 11:
    //         System.out.println( "30日です" );
    //         break;
    //     case 1:
    //     case 3:
    //     case 5:
    //     case 7:
    //     case 8:
    //     case 10:
    //     case 12:
    //         System.out.println( "31日です" );
    //         break;
    //     default:
    //         System.out.println( "入力が間違っています" );
    //         break;
    //   }
  }
}