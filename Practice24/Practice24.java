public class Practice24 {
  public static void main(String[] args) {
    try{
      int numerator = 4200;
      int denominator;
      denominator = Integer.parseInt(args[0]);
      int result = numerator / denominator;
      System.out.println("割り算の結果は" + result + "です");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("コマンドライン引数を指定してください");
    } catch (NumberFormatException e) {
      System.out.println("コマンドライン引数には整数をしてしてください");
    } catch (ArithmeticException e) {
      System.out.println("コマンドライン引数には0以外の整数を指定してください");
    } finally {
      System.out.println("プログラムを終了します");
    }
    
  }
}