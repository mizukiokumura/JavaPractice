public class Practice27 {
  public static void main(String[] args) {
    // 問題1-1
    // int mPrice;

    // mPrice = 130;

    // int mNum = 6;

    // int mTotal = mPrice * mNum;

    // System.out.println("みかんの価格:" + mPrice + "円");

    // System.out.println("みかんの個数:" + mNum + "個");

    // System.out.println("みかんの総価格:" + mTotal + "円");

    // 問題1-2;

    // // 5 と 6 と 7 を足した合計に 8 を掛けた値は？
    // System.out.println( (5 + 6 + 7) * 8 );

    // // 7 と 8 を足した値を 5 で割った値に、
    // // 6 から 4 を引いた値に 2 を掛けた値を足した値は？
    // System.out.println(((7 + 8) / 5) + ((6-4) * 2) );

    // // 1000 を 7 で割ったあまりは？
    // System.out.println( 1000 % 7 );

    // // 6 を 5 で割った値を、さらに 2 で割った正確な値は？
    // System.out.println( (float)((double)(6 / 5)/ 2));

    // // アルファベットの大文字 'A' に 32 を足した文字は？
    // System.out.println( (char)('A' + 32)  );

    // 問題1-3;

    // short s1 = 65;

    // System.out.println(s1);

    // byte b = (byte)s1;

    // System.out.println(b);

    // char c = (char)b;

    // System.out.println(c);

    // short s2 = (short)(s1 + b);

    // System.out.println(s2);

    // 問題1-4;

    // int value = -15;

    // if((value % 2) == 0) {
    //   System.out.println("偶数です");
    // } else {
    //   System.out.println("奇数です");
    // }

    // if((value % 3) == 0 && (value % 4) == 0 && (value % 5) == 0) {
    //   System.out.println("3の倍数です");
    // } else if((value % 4) == 0) {
    //   System.out.println("4の倍数です");
    // } else if((value % 5) == 0) {
    //   System.out.println("5の倍数です");
    // }

    // 問題1-5;

    // int age = -2;

    // System.out.println("年齢:" + age);

    // if(age < 0) {
    //   System.out.println("エラー");
    // } else if (age < 20  ) {
    //   System.out.println("未成年です");
    //   if(age < 6 || age <= 14) {
    //     System.out.println("今は義務教育を受けています");
    //   } else {
    //     System.out.println("今は義務教育を受けていません");
    //   }
    // } else {
    //   System.out.println("成人です");
    // }

    // 問題1-6;
    // double height = 170.0;
    // double weight = 55.0;
    // double mHeight = height / 100;
    // double bmi = weight / (mHeight * mHeight) ;

    //  System.out.println("身長：" + height + "（cm）");
    //  System.out.println("体重：" + weight + "（kg）");

    // System.out.println("あなたのBMI値は" + bmi + "です");
    // if(bmi >= 26.5) {
    //   System.out.println("肥満です");
    // } else if(bmi >= 24 && bmi < 25.5) {
    //   System.out.println("太り気味です");
    // } else if(bmi < 24 && bmi >= 20) {
    //   System.out.println("普通です");
    // } else if(bmi < 20 && bmi >= 0) {
    //   System.out.println("スリムです");
    // } else {
    //   System.out.println("エラーです");
    // }

    // 問題1-7;

    // int month = 13;

    // System.out.println(month + "月");

    // switch(month) {
    //   case 1,3,5,7,8,10,12:
    //     System.out.println(month + "月は31日まであります");
    //     break;
    //   case 4,6,9,11:
    //     System.out.println(month + "月は30日まであります");
    //     break;
    //   case 2:
    //     System.out.println(month + "月は28、または、29日まであります");
    //     break;
    //   default :
    //     System.out.println("エラー");
    //     break;
        
    // }

    // 問題 1-8;
    // for(int i = 21; i < 29; i++) {
    //   if(i % 3 == 0) {
    //     System.out.println(i + "は3の倍数です");
    //   }
    //   if(i % 4 == 0) {
    //     System.out.println(i + "は4の倍数です");
    //   }
    //   if(i % 5 == 0 ) {
    //     System.out.println(i + "は5の倍数です");
    //   }
    //   if(i % 6 == 0) {
    //     System.out.println(i + "は6の倍数です");
    //   }
    //   if(i % 7 == 0) {
    //     System.out.println(i + "は7の倍数です");
    //   }
    //   if(i % 8 == 0) {
    //     System.out.println(i + "は8の倍数です");
    //   }
    //   if(i % 9 == 0) {
    //     System.out.println(i + "は9の倍数です");
    //   }
    // }

    // 問題1-9;
    //   int i,j,yakusuu;
    // for(i = 1; i < 100; i++) {
    //   yakusuu = 0;
    //   for(j = 1; j<= i; j++) {
    //     if(i % j == 0) {
    //       yakusuu++;
    //     }
    //   }
    //     if(yakusuu == 2) {
    //       System.out.println( i);
    //     }
      
    // }
    // System.out.printf("\n");

    // 問題 1-10;

    // int level = 5;
    // for(int i = 0;i < level; i++ ) {
    //   for(int u = 0; u < 1; u++) {
    //     switch(i){
    //       case 0:
    //         System.out.println("　　　　■");
    //         break;
    //       case 1:
    //         System.out.println("　　　■ ■ ■");
    //         break;
    //       case 2:
    //         System.out.println("　　■ ■ ■ ■ ■");
    //         break;
    //       case 3:
    //         System.out.println("　■ ■ ■ ■ ■ ■ ■");
    //         break;
    //       case 4:
    //         System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■");
    //         break;
    //     } 
    //   }
    // }
    
    // 問題 1-11;

    // int x = 1;

    // while(x < 1000){
    //   if(x >= 500){
    //     break;
    //   }
    //   System.out.println(x *= 2);
    // }

    // 問題 1-12

    // display("テスト", 5);

    // 問題 1-13

    // int a = 18;
    // int b = 6;

    // System.out.println("足し算:" + calc(a, b, 0));
    // System.out.println("引き算:" + calc(a, b, 1));
    // System.out.println("掛け算:" + calc(a, b, 2));
    // System.out.println("割り算:" + calc(a, b, 3));

    // 問題 1-14;
    // int x = 96;
    // int y = 88;
    // int z = 79;

    // System.out.println("整数" + x + "、" + y + "、" + z + "の中で最小の値は");
    // System.out.println(min(x,y,z) + "です");

    // 問題 1-15;
    // int[] arr;
    //  arr = new int[3];

    // arr[0] = 25;
    // arr[1] = 39;
    // arr[2] = 43;

    // for(int i = 0; i < arr.length; i++) {
    //   System.out.println((i + 1) + "番目の値は" + arr[i] + "です");
    // }

    // 問題 1-16;

    // int[] arr = {1,2,3,4,5,6,7};
    // System.out.println("配列の合計値:" + sum(arr));

    // 問題 1-17;

    // int[] arr = {43, 2, 765, 234, 908, 115, 32, 476, 938, 65, 93, 47, 102, 735, 529, 1010, 639, 660, 182, 908};

    // System.out.println("配列の最大値:" + max(arr));

    // 問題 1-18;

    // int[] arr = {13,90,10,79,101, 25, 123, 38, 5, 16, 64, 55, 17};
    // int[] arr2 = {38, 118, 26, 17, 41, 53, 10,88, 92, 102, 67, 22, 55};

    // System.out.println("共通する数値の個数:" + common(arr, arr2) );

    // 問題 1-19;

    int[][] arr = {{11,22,33},{44},{55,66}, {77,88,99}};

    for(int i = 0; i < arr.length; i++) {
      for(int u = 0; u < arr[i].length; u++) {
        System.out.print(arr[i][u]);
      }
    }

    System.out.println();



    for(int i = arr.length - 1; i >= 0; i--) {
      int n = 0;
      int m = 0;
      for(int u = 0; u < arr[i].length - 1; u++ ) {
        arr[m][n] = arr[i][u];
        System.out.print(arr[m][n]);
        n++;
      }
      m++;
    }
  }

  // 問題1-12;

  // public static void display(String st, int num) {
  //   for(int i = 0; i < num; i++) {
  //     System.out.println(st);
  //   }
  // }

  // 問題 1-13;

  // public static int calc(int a, int b, int c) {
  //   switch(c) {
  //     case 0:
  //       return a + b;
  //     case 1:
  //       return a - b;
  //     case 2:
  //       return a * b;
  //     case 3:
  //       return a / b;
  //     default:
  //       return 0;
  //   }
  // }
  
  // 問題 1-14;
  // public static int min(int x, int y, int z) {
  //   if(x > y) {
  //     if(y > z) {
  //       return z;
  //     } else {
  //       return y;
  //     }
  //   } else {
  //     if(x > z) {
  //       return z;
  //     } else {
  //       return x;
  //     }
  //   }
  // }

  // 問題 1-16;

  // public static int sum(int[] arr) {
  //   int total = 0;
  //   for(int a : arr) {
  //     total += a;
  //   }
  //   return total;
  // }
  
  // 問題 1-17;

  // public static int max(int[] arr) {
  //   int max = 0;
  //   for(int i = 0; i < arr.length; i++) {
  //     if(arr[i] > max) {
  //       max = arr[i];
  //     }
  //   }
  //   return max;
  // }

  // 問題 1-18;

  // public static int common(int[] arr, int[] arr2) {
  //   int count = 0;
  //   for(int i = 0; i < arr.length; i++) {
  //     for(int u = 0; u < arr2.length; u++) {
  //       if(arr[i] == arr2[u]) {
  //         count++;
  //       }
  //     }
  //   }
  //   return count;
  // }
}