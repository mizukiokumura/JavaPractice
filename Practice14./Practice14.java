public class Practice14 {
  public static void main(String[] args) {
    Car car1 = new Car("トント", 1234, 10.0);
    Car car2 = new Car("ファット", 6789);

    car1.run(7.0);
    car2.run(7.0);

    car1.showInfo();
    car2.showInfo();
  }
}