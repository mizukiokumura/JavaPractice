import java.io.*;
public class Practice28 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //プログラム作成練習問題1

    // int n = 1;

    // if(n == 0) {
    //   System.out.println("0です");
    // } else if(n > 0) {
    //   System.out.println("正です");
    // } else {
    //   System.out.println("負です");
    // }

    // プログラム作成問題2

    //   int count = 0;
    //   for(int i = 1; i <= 10; i++ ) {
    //     count += i;
    //   }
    //   System.out.println(count);

    // プログラム作成問題3

    // int n = Integer.parseInt(br.readLine());

    // if(n % 2 == 0) {
    //   System.out.println("偶数です");
    // } else {
    //   System.out.println("奇数です");
    // }

    // プログラム作成問題4
    // int n = Integer.parseInt(br.readLine());

    // for(int i = 0; n != 0; i++ ) {
    //   if(n > 0) {
    //     System.out.println("nを１減らしました今のnは" + n + "です");
    //     n--;
    //   } else {
    //     System.out.println("nを１増やしました今のnは" + n + "です");

    //     n++;
    //   }
    // }
    // if(n == 0) {
    //   System.out.println("nが0になりました");
    // }
    // while(n != 0) {
    //   if(n > 0) {
    //       System.out.println(n--);
    //   } else {
    //       System.out.println(n++);
    //   }
    // }
    // System.out.println(n);
    // if(n > 0) {
    //   for(int i = n; i >= 0; i--) {
    //       System.out.println(i);
    //   }
    // } else {
    //   for(int i = n; i <= 0; i++) {
    //       System.out.println(i);
    //   }
    // }

    // プログラム作成問題5

    // int n = Integer.parseInt(br.readLine());

    // for(int i = 1; i <= n; i++) {
    //   System.out.print((i));
    //   if(i != n) {
    //     System.out.print(",");
    //   }
    // }
    
    // プログラム作成問題6

    // int[] array = {64, 3, 45, 291, 178};
    // int min = array[0];

    // for(int i = 0; i < array.length; i++) {
    //   if(min > array[i]) {
    //     min = array[i];
    //   }
    // }
    // System.out.println(min);

    // プログラム作成問題7

    //     int num = Integer.parseInt(br.readLine());

    //     System.out.println(Math.abs(num));

    //     public class Exercise_007 {
    //     public static void main(String[] args) {
    //         int num = -10;
 
    //         System.out.println(num < 0 ? -num : num);
    //     }
    // }

    // プログラム作成問題8

    // int x,y;
    // System.out.println("数値を2回入力してください");

    // x = Integer.parseInt(br.readLine());
    // y = Integer.parseInt(br.readLine());

    // System.out.println(x + "と" + y + "の差は" + Math.abs(x - y) + "です");


    // プログラム作成問題9

    // int n = Integer.parseInt(br.readLine());

    // for(int i = 0; i < n; i++) {
    //   for(int u = 0; u < n; u++) {
    //     System.out.print("●");
    //   }
    //   System.out.println("");
    // }

    // プログラム作成問題10

    // int n = Integer.parseInt(br.readLine());

    // for(int i = 0; i < n; i++) {
    //   for(int u = 0; u < (i + 1); u++) {
    //     System.out.print("●");
    //   }
    //   System.out.println("");
    // }

    // プログラム作成問題 11

    // int n = Integer.parseInt(br.readLine());

    // for(int i = 0; i < n; i++ ) {
    //   for(int j = 0; j < n; j++) {
    //     if(i > j) { // １周目から見てみると、ここで i = 0と j = 0の審議が行われてiがjより大きい時にtrueが出るので1周目は全部falseになり、⚫︎が4つ並ぶことになり、2周目は i = 1と j = 0との審議になり、2周目の１回目はiの方が大きくなるので、trueとなり、空白が生まれる2周目の2回目以降はfalseになり3回⚫︎が出力される。

    //       System.out.print(" "); 
    //     } else {
    //       System.out.print("●");
    //     }
    //   }
    //   System.out.println();
    // }
   }
}