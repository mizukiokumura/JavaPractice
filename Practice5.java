import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Practice5 {
  public static void main(String[] args) throws IOException{
    // 練習問題 5-1
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] array = new int[10];
    // for(int i = 0; i < array.length; i++) {
    //   System.out.println("適当な数値を入力してください");
    //   array[i] = Integer.parseInt(br.readLine());
    // }
    // for(int ary : array) {
    //   System.out.println(ary * 2);
    // }
    // 練習問題 5-2
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] array = new int[10];
    // for(int i = 0; i < array.length; i++) {
    //   System.out.println("数値を10回入力してください");
    //   array[i] = Integer.parseInt(br.readLine());
    // }
    // for(int i = array.length - 1; i > 0; i--) {
    //   System.out.println(array[i]);
    // }
    // 練習問題 5-3
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int[] array = new int[10];
    // for(int i = 0; i < array.length; i++) {
    //   System.out.println("数値を入力してください");
    //   array[i] = Integer.parseInt(br.readLine());
    // }
    // System.out.print("偶数：");
    // for(int ary : array) {
    //   if(ary % 2 == 0) {
    //     System.out.print(ary);
    //   }
    // }
    // System.out.print("奇数:");
    // for(int ary : array) {
    //   if(ary % 2 != 0) {
    //     System.out.print(ary);
    //   }
    // }
    // BufferedReader br = new BufferedReader(
    //                     new InputStreamReader( System.in ) );
    // int     values[] = new int[10];

    // for( int i = 0 ; i < 10 ; i++ )
    //     values[i] = Integer.parseInt( br.readLine() );

    // System.out.print( "\n偶数：" );

    // for( int n : values )
    //     if( ( n % 2 ) == 0 )
    //         System.out.print( n + " " );

    // System.out.print( "\n奇数：" );

    // for( int n : values )
    //     if( ( n % 2 ) != 0 )
    //         System.out.print( n + " " );
    // 練習問題 5-4
    // BufferedReader br = new BufferedReader(
    //                         new InputStreamReader( System.in ) );
    // int     values[] = new int[10];
    // int     cnt, sum;

    // for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ )
    // {
    //     values[cnt] = Integer.parseInt( br.readLine() );
    //     sum += values[cnt];
    // }

    // for( int i = 0 ; i < cnt ; i ++ )
    //     System.out.print( "\n" + values[i] );
    // 練習問題 5-5
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int value = Integer.parseInt(br.readLine());
    // int binary[] = new int[16];
    // for(int i = 15; i >= 0; i--, value /= 2) {
    //   binary[i] = value % 2;
    // }

    // for(int i = 0; i < 16; i++ ) {
    //   System.out.println(binary[i]);
    // }
    // 練習問題 5-6
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int kuku[][] = new int[9][9];

    // for(int i = 0; i < 9; i++) {
    //   for(int u = 0; u < 9; u++) {
    //     kuku[i][u] = (i + 1) * (u + 1);
    //   }
    // }

    // for(int i = 0; i < 9; i++) {
    //   for(int j = 0; j < 9; j++) {
    //     System.out.printf("%2d",kuku[i][j]);
        
    //   }
    //   System.out.println();
    // }
    // 練習問題 5-7
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int kuku[][] = new int[9][9];
    // int x = 0;
    // int n = 0;
    // for(int i = 0; i < 9; i++) {
    //   for(int u = 0; u < 9; u++) {
    //     kuku[i][u] = (i + 1) * (u+ 1);
    //   }
    // }
    // System.out.println("1桁の数値を2回入力してください");
    // x = Integer.parseInt(br.readLine());
    // n = Integer.parseInt(br.readLine());
    // System.out.println(kuku[x-1][n-1]);
    // 練習問題 5-8
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Integer[] array = new Integer[10];
    // for(int i = 0; i < 10; i++) {
    //   System.out.println("整数を入力してください");
    //   array[i] = Integer.parseInt(br.readLine());
    // }
    // Arrays.sort(array);
    // System.out.println(Arrays.toString(array));
    
    // BufferedReader br = new BufferedReader(
    //                     new InputStreamReader( System.in ) );
    // int values[] = new int[10];

    // for( int i = 0 ; i < 10 ; i++ )
    //     values[i] = Integer.parseInt( br.readLine() );

    // for( int i = 0 ; i < 10 ; i++ )
    // {
    //     for( int j = i + 1 ; j < 10 ; j++ )
    //     {
    //         if( values[i] > values[j] ){ ここで0番目の配列と、一番目の配列を比較して、0番目の方が大きかった場合
    //             int t = values[i]; ここで0番目の配列を変数tに入れて一旦保存し
    //             values[i] = values[j]; ここで0番目に小さい方の配列(1番目)を入れて、
    //             values[j] = t; そしてここで、1番目の配列に大きいかった0番目の配列を入れている。
    //         }
    //     }
    // }

    // for( int i = 0 ; i < 10 ; i++ )
    //     System.out.print( values[i] + " " );
  }
}