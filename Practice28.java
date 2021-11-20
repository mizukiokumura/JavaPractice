import java.io.*;
import java.util.Scanner;
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
    
    // プログラム作成問題 12

    //   int n = Integer.parseInt(br.readLine());

    //   for(int i = 0; i < n ; i++ ) {
    //     for(int u = 0; u <= i; u++) {
    //       System.out.print("●");
    //     }
    //     System.out.println();
    //   }
    //   int n = 4;
    //       for (int i = 1; i <= n; i++) {
    //           dispCircle(i, n);
    //           System.out.println();
    //       }
    //   }

    //   static void dispCircle(int i, int n) {
    //       for (int j = n; j >= 1; j--) {
    //           if (i < j) {
    //               System.out.print("　");
    //           } else {
    //               System.out.print("●");
    //           }
    //       }

    // プログラム作成問題 13

    // int a,b,c;
    // a = Integer.parseInt(br.readLine());
    // b = Integer.parseInt(br.readLine());
    // c = Integer.parseInt(br.readLine());

    // if (a > b && a > c) {
    //   System.out.println("最大値はaです");
    // } else if( b > a && b > c) {
    //   System.out.println("最大値はbです");
    // } else {
    //   System.out.println("最大値はcです");
    // }

    // プログラム作成問題 14

    // int n = Integer.parseInt(br.readLine());
    // int count = 0;
    // StringBuilder sb = new StringBuilder();

    // for(int i = 1; i <= n; i++) {
    //   count += i;
    //   sb.append(i);
    //   if( i == n ) {
    //     sb.append("=");
    //     sb.append(count);
    //   } else {
    //     sb.append("+");
    //   }
    // }
    // String max = sb.toString();

    // System.out.println(max);

    // // 回答例
    // int n = 10;
 
    //     StringBuilder formula = new StringBuilder();
    //     int sum = 0;
 
    //     for (int i = 1; i <= n; i++) {
    //         sum += i;
    //         formula.append(i);
    //         if (i != n) {
    //             formula.append(" + ");
    //         }
    //     }
    //     formula.append(" = ");
    //     System.out.println(formula.toString() + sum);

    // プログラム作成問題 15
    // int[] arr = { 1, 4, 9, 16 };
    // for (int num : arr) {
    //     if (num % 2 == 0) {
    //         System.out.println(num + "は偶数です。");
    //     } else {
    //         System.out.println(num + "は奇数です。");
    //     }
    // }

    // プログラム作成問題 16

    // int[] nums = {5, 6, 1, 23, 45, 3, 21, 80, 64};
    // StringBuilder sb = new StringBuilder();
    // int nl = nums.length;
    // int total = 0;
    // for(int i = 0; i < nl; i++) {
    //   total += nums[i];
    //   sb.append(nums[i]);

    //   if(nl == i + 1) {
    //     sb.append("=");
    //   } else {
    //     sb.append("+");
    //   }
    // }
    // System.out.println(sb.toString() + total );

    // プログラム作成問題 17

    // int[] sums = {4,8, 10, 25, 31, 26, 44, 2};
    // int min = sums[0];
    // int max = sums[0];

    // for(int sum : sums) {
    //   if( sum < min) {
    //     min = sum;
    //   } else if( sum > max) {
    //     max = sum;
    //   }
    // }
    // System.out.println("最小値" + min);
    // System.out.println("最大値" + max);
    // // 回答例
    // int[] arr = { 1, 4, 9, 16 };
    //     int max = 0;
    //     int min = arr[0];
    //     for (int num : arr) {
    //         max = Math.max(max, num);
    //         min = Math.min(min, num);
    //     }
    //     System.out.println("最大は" + max + "、最小は" + min + "です。");

    // プログラム作成問題 18
    // String name = br.readLine();
    // StringBuilder sb = new StringBuilder(name);
    // name = sb.reverse().toString();
    // System.out.println(name);

    // String str = "あいうえお";

    //   int maxIndex = str.length() - 1;
    //   for(int i = maxIndex; i >= 0; i--) {
    //       System.out.print(str.charAt(i));
    //       // charAt()はある特定の文字列から、引数で指定した数の文字を取得することができる。例 str.charAt(2)
    //   }

    // プログラム作成問題 19

    
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int count = str.length();
    // if( count > 10) {
    //   while( count > 10) {
    //     System.out.println("１０文字を超えています再度入力してください");
    //     str = sc.nextLine();
    //     count = str.length();
    //   }
    // } 
    // System.out.println(str.length());
    // Scanner sc = new Scanner(System.in);
 
    //     int strLength;
    //     System.out.println("文字数を判定します。");
    //     do {
    //         System.out.println("10文字までしか入力できません");
    //     } while ((strLength = sc.next().length()) > 10);
 
    //     System.out.println(strLength + "文字です");

    // プログラム作成問題 20

    // int[] array = {30, 25, 43, 53, 64, 53, 23, 35};
    // int total = 0;
    // for(int i = 0; i < array.length; i++) {
    //   total += array[i];
    // }

    // System.out.println((total / array.length));
  
    // // 回答例
    // public static void main(String[] args) {
    //     int[] arr = { 1, 4, 9, 16 };
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     double avg = (double) sum / arr.length;
    //     System.out.println("平均は" + avg + "です。");

    // プログラム作成問題 21

    // int[][] nums = {{19, 20, 43}, { 34, 53, 72}, {65, 74, 54}, {45, 53, 90, 56, 68}};
    // int total = 0;

    // for(int i = 0; i < nums.length; i++) {
    //   for(int u = 0; u < nums[i].length; u++) {
    //     total += nums[i][u];
    //   }
    //   System.out.println( i + "番目の配列の平均は" + (total / nums[i].length) + "です");
    //   total = 0;
    // }

    // // 修正コード
    // int[][] array = {{19, 20, 43}, { 34, 53, 72}, {65, 74, 54}, {45, 53, 90, 56, 68}};
    // int tol = 0;
    // int leng = 0;
    // for(int n = 0; n < array.length; n++) {
    //   for(int j = 0; j < array[n].length; j++) {
    //     tol += array[n][j];
    //   }
    //   leng += array[n].length;
    // }

    // double average = (double) tol / leng;
    // System.out.println("平均は" + average + "です");

    // // 回答例
    // int[][] arr = { { 0, 1, 9, 10 }, { 4, 6, 8, 10 } };
    // int sum = 0;
    // int len = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[i].length; j++) {
    //     sum += arr[i][j];
    //   }
    //   len += arr[i].length;
    // }
    // double avg = (double) sum / len;
    // System.out.println("平均は" + avg + "です。");

    // プログラム作成問題 22

    // int[][] nums = {{72, 42, 53, 40}, {84, 98, 97}, {43, 23, 15, 56, 63}};

    // for(int i = 0; i < nums.length; i++) {
    //   for(int n = 0; n < nums[i].length; n++) {
    //     if(nums[i][n] % 2 == 0) {
    //       System.out.println(nums[i][n] + "は偶数です");
    //     } else {
    //       System.out.println(nums[i][n] + "は奇数です");
    //     }
    //   }
    // }

    // プログラム作成問題 23

    // int[][] array = {{53, 23, 43, 54}, {54, 66, 78, 89}, {31, 11, 10, 98}, {45, 43, 26, 80}};
    // int min = array[0][0];
    // int max = 0;
    // for(int i = 0; i < array.length; i++) {
    //   System.out.print(i + "番目の配列の中身は");
    //   for(int n = 0; n < array[i].length; n++ ) {
    //      System.out.print(array[i][n]);
    //      if(n != array[i].length - 1) {
    //         System.out.print(",");
    //       } else {
    //         System.out.print("");
    //       }
    //     if(array[i][n] < min) {
    //       min = array[i][n];
    //     } else if(array[i][n] > max) {
    //       max = array[i][n];
    //     }
    //   }
    //   System.out.println();
    // }

    // System.out.println("最小値は" + min + "です");
    // System.out.println("最大値は" + max + "です");

    // // 回答例
    // int[][] arr = { { 0, 1, 9, 10 }, { 4, 6, 8, 10 } };
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // for (int[] row : arr) {
    //   for (int num : row) {
    //     max = Math.max(max, num);
    //     min = Math.min(min, num);
    //   }
    // }
    // System.out.println("最大は" + max + "、最小は" + min + "です。");
    

  }
}