public class Practice13 {
  public static void main(String[] args) {
    Square square = new Square(4.5, 2.8);

    square.inform();
    
    System.out.println("この四角形の面積は" + square.getArea() + "です。");

    square.addWidth(3.0);

    System.out.println();

    square.inform();
    System.out.println("この四角形の面積は" + square.getArea( ) + "です。");
  }
}