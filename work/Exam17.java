class Exam17 {
  public static void main(String[] args) {
    // 練習問題;
    // int number01 = 25;
    // int number02 = 2;
    // String operator = "/";
    // System.out.print(number01 + operator + number02 + "=");
    // System.out.println(number01 / (double)number02);
    // Exam18
    int price = 980;
    int tax_rate = 8;
    System.out.println("税込金額は" + (int)(price + (price * tax_rate * 0.01)) + "円です");
  }
}