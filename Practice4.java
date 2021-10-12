import java.io.*;
public class Practice4 {
  public static void main(String[] args) throws IOException {
    // 練習問題 4-1;
    // for (int i = 0 ; i < 10; i++) {
    //   System.out.println("SPAM" + i + "回目");
    // }
    // 練習問題 4-2;
    // for (int i = 0; i < 9; i++) {
    //   System.out.println(3 * (i + 1));
    // }
    // 練習問題 4-3;
    // int x = 1;
    // for(int n = 1; n <= 8; n++){
    //   x *= 2;
    //   System.out.println("2の" + n + "乗=" + x);
    // }
    // 練習問題 4-4;
    // int u = 0;
    // for(int i = 7; i > 0; i--) {
    //   int n = i--;
    //   u = i * n;
    //   System.out.println( i + "回目の７の階乗は" + u);
    // }
    // int x = 1;
    // for(int i = 2; i <= 7; i++) {
    //   x *= i;
    //   System.out.println(x);
    // 練習問題 4-5;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int x = 0;
    // System.out.println("整数を入力してください");
    // for(int i =0; i <10; i++) {
    //   int u = Integer.parseInt(br.readLine());
    //   x += u;
    // }
    // System.out.println("整数の平均値は" + (x / 10)  + "です");
    // 練習問題 4-6;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int winCount = 0;
    // int loseCount = 0;
    // int x = 0;
    // System.out.println("0か1を入力してください");
    // for(int i = 0; i < 10; i++){
    //   x = Integer.parseInt(br.readLine());
    //   if (x == 1) {
    //     winCount++;
    //   } else if (x == 0) {
    //     loseCount++;
    //   } else {
    //     System.out.println("誤った入力です。");
    //   }
    // }
    // System.out.println("勝ちの数は" + winCount + "回です");
    // System.out.println("負の数は" + loseCount + "回です");
    // 練習問題 4-7;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int bigHuman = 0;
    // int halfGod = 0;
    // for(int i = 0; i < 9; i++) {
    //   System.out.println( (i + 1) +  "回表、巨人の得点は?");
    //   bigHuman += Integer.parseInt(br.readLine());
    //   System.out.println( (i + 1) + "回裏、阪神の得点は?");
    //   halfGod += Integer.parseInt(br.readLine());
    // }
    // System.out.println("巨人:" + bigHuman + "点,阪神:" + halfGod + "点" );
    // if (bigHuman > halfGod) {
    //   System.out.println("巨人の勝ち");
    // } else {
    //   System.out.println("阪神の勝ち");
    // }
    // 練習問題 4-8;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] x = new int[10];
    // System.out.println("正の整数を入力してください");
    // for(int i = 0; i < 10; i++) {
    //   x[i] = Integer.parseInt(br.readLine());
    // }
    // int[] y = new int[1];
    // for(int i = 0; i < x.length; i++) {

    //   if ( y[1] < x[i]) {
    //     y = x[i];
    //   }

    // }
    // System.out.println("最大値は" + y + "です");
    // BufferedReader br = new BufferedReader(
    //                     new InputStreamReader( System.in ) );
    // int max_value = 0;

    // for( int i = 0 ; i < 10 ; i++ )
    // {
    //     int value = Integer.parseInt( br.readLine() );

    //     if( value > max_value )
    //         max_value = value;
    // }

    // System.out.println( "最大値=" + max_value );
    // 練習問題4-9;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int max = 0;
    // int min = 20;
    // System.out.println("整数を10回入力してください");
    // for(int i = 0; i < 10; i++) {
    //   int num = Integer.parseInt(br.readLine());
    //   if (max < num) {
    //     max = num;
    //   } 
    //   if (min > num) {
    //     min = num;
    //   }
    // }
    // System.out.println("最大値は" + max + "です");
    // System.out.println("最小値は" + min + "です");
    // 練習問題 4-10;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("個数を入力してください");
    // int number = Integer.parseInt(br.readLine());

    // for(int i = 0; i < number ; i++ ) {
    //   System.out.print("*");
    // }
    // 練習問題4-11;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int num = Integer.parseInt(br.readLine());
    // int count = 0;
    // for(int i = 0; i < num; i++ ) {
    //   System.out.print(count);
    //   count++;
    //   if (count > 9 ) {
    //     count = 0;
    //   }
    // }
    // 練習問題 4-12
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int num = 0 ;
    // int total = 0;
    // while (total < 100) {
    //   System.out.println("数値を入力してください");
    //   num = Integer.parseInt(br.readLine());
    //   total += num;
    // }
    // System.out.println("合計は" + total + "です");
    // 練習問題 4-13;
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int sCount = 0;
    // int bCount = 0;

    // while ( (sCount < 3) && (bCount < 4)) {
    //   System.out.println("ストライクだった場合は1をボールだった場合は2を入力してください");
    //   int count = Integer.parseInt(br.readLine());
    //   if (count == 1 ) {
    //     System.out.println(sCount++);
    //   } else {
    //     System.out.println(bCount++);
    //   }
    // }
    // System.out.println(bCount + "ボール," + sCount + "ストライク");
    // 練習問題 4-14
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int sCount = 0;
    // int bCount = 0;

    // while (sCount < 3 && bCount < 4) {
    //   System.out.println("今のカウントは何でしたか？入力してください。1:ストライク,2:ボール,3:ファウル");
    //   int count = Integer.parseInt(br.readLine());
    //   if (count == 1) {
    //     sCount++;
    //   }else if(count == 3) {
    //     if (sCount <= 1) {
    //       sCount++;
    //     }
    //   } else {
    //     bCount++;
    //   }
    // }
    // System.out.println(bCount + "ボール," + sCount + "ストライク");
    // 練習問題4-15
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // int num = 0;
      // System.out.println("整数を入力してください");
      // num = Integer.parseInt(br.readLine());
      // if(num % 7 != 0) {
      //   System.out.println("その数字は素数です");

      // } else {
      //   System.out.println("その数字は素数ではありません");
      // }
      //  BufferedReader br = new BufferedReader(
      //                    new InputStreamReader( System.in ) );
      // int value = Integer.parseInt( br.readLine() );
      // int n;

      // for( n = 2 ; n <= ( value / 2 ) ; n++ ){ value割る２で入力された値を割ってループ回数を決めている
      //     if( ( value % n ) == 0 ) 
      //         break;
      // }

      // if( n > ( value / 2 ) )
      //     System.out.println( value + "は素数です" );
      // else
      //     System.out.println( value + "は素数ではありません" );
      // 練習問題 4-16
    // BufferedReader br = new BufferedReader(
    //                         new InputStreamReader( System.in ) );
    // int n = Integer.parseInt( br.readLine() );

    // for( int x = 2 ; n > 1 ; x++ ){
    //     while( ( n % x ) == 0 ){
    //         System.out.print( x + " " );
    //         n /= x;
    //     }
    // }
    // 練習問題 4-17
    // for(int i = 1; i <= 9; i++){
    //   for(int u = 1; u <= 9; u++) {
    //     int x = i * u ;
    //     System.out.printf("%2d", x);
    //   }
    // }
  }
}