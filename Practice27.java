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

    int age = -2;

    System.out.println("年齢:" + age);

    if(age < 0) {
      System.out.println("エラー");
    } else if (age < 20  ) {
      System.out.println("未成年です");
      if(age < 6 || age <= 14) {
        System.out.println("今は義務教育を受けています");
      } else {
        System.out.println("今は義務教育を受けていません");
      }
    } else {
      System.out.println("成人です");
    }

  }
}