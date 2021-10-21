// 練習問題 7-5
class CoinCase {
  // 練習問題 7-5
  // private int ;
  // private int Quantity;
  // static void AddCoins(int type, int quantity) {
  //   Type = type;
  //   Quantity = quantity;
  // }
  // static int GetCount(int type, int num) {

  // }
  // private int Yen500 = 0; コインの枚数を入れている。
  // private int Yen100 = 0;
  // private int Yen50 = 0;
  // private int Yen10 = 0;
  // private int Yen5 = 0;
  // private int Yen1 = 0;
  // public void AddCoins(int kind, int count) {
  //   Switch(kind) { スイッチ文で書くんだなと思った。
  //     case 500:
  //       Yen500 += count; 
  //       break;
  //     case 100:
  //       Yen100 += count;
  //       break;
  //     case 50:
  //       Yen50 += count;
  //       break;
  //     case 10:
  //       Yen10 += count;
  //       break;
  //     case 5:
  //       Yen5 += count;
  //       break;
  //     case 1:
  //       Yen1 += count;
  //       break;
  //   }
  // }
  // public int GetCount(int kind) {
  //   switch(kind) { ここはよくわかんなかったけど、おそらく独立したつのメソッドとして、考えるとわかった、変数の中身が何枚あるかを返してるんだなと。
  //     case 500:
  //       return Yen500;
  //     case 100:
  //       return Yen100;
  //     case 50:
  //       return Yen50;
  //     case 10:
  //       return Yen10;
  //     case 5:
  //       return Yen5;
  //     case 1:
  //       return Yen1;
  //   }
  //   return 0;
  // }
  // public int GetAmount() {
  //   return(Yen500 * 500) + (Yen * 100) + (Yen * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1; ここでなるほどなーと思った、そうだよなーそうすれば確かに計算できるなと思った。
  // }
  // 練習問題 7-6
  private int Yen500 = 0;
  private int Yen100 = 0;
  private int Yen50 = 0;
  private int Yen10 = 0;
  private int Yen5 = 0;
  private int Yen1 = 0;
  public void GetCoins(int kind, int count) {
    
    switch(kind) {
      case 500:
        Yen500 += count;
        break;
      case 100:
        Yen100 += count;
        break;
      case 50:
        Yen50 += count;
        break;
      case 10:
        Yen10 += count;
        break;
      case 5:
        Yen5 += count;
        break;
      case 1:
        Yen1 += count;
        break;
    }
  }
  
  public int GetCount(int kind) {
    switch(kind) {
      case 500:
        return Yen500;
      case 100:
        return Yen100;
      case 50:
        return Yen50;
      case 10:
        return Yen10;
      case 5:
        return Yen5;
      case 1:
        return Yen1;
    }
    return 0;
  }
  public void GetCount() {
    int total = Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
    System.out.println(total + "枚です");

  }
  public void GetAmount(int kind) {

    switch(kind) {
      case 500:
        System.out.println("500円の総額は" + (Yen500 * 500) + "円です");
        break;
      case 100:
        System.out.println("100円の総額は" + (Yen100 * 100) + "円です");
        break;
      case 50:
        System.out.println("50円の総額は" + (Yen50 * 50) + "円です");
        break;
      case 10:
        System.out.println("10円の総額は" + (Yen10 * 10) + "円です");
        break;
      case 5:
        System.out.println("5円の総額は" + (Yen5 * 5) + "円です");
        break;
      case 1:
        System.out.println("1円の総額は" + (Yen1 * 1) + "円です");
        break;

    }
  } 
  public int GetAmount() {
    return (Yen500 * 500) + (Yen100 * 100) + (Yen50 * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1;
  }
}