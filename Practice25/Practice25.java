public class Practice25 {
  public static void main(String[] args) {
    Car mycar = new Car(123, "ロミオ", 0.8);
    try { 
      while(true) {
        mycar.run();
      }
    } catch (GasolineException e) {
      System.out.println(e.getMessage());
    }
  }
}