public class Car {
  private String type;
  private int number;
  private double gasoline = 5.0;

  Car(String type,int number, double gasoline) {
    this.type = type;
    this.number = number;
    this.gasoline = gasoline;
  }

  Car(String type, int number ) {
    this.type = type;
    this.number = number;
  }

  void run(double gasoline) {
    if (gasoline > this.gasoline) {
      System.out.println("ナンバー" + number + "の" + type + "はガソリン不足のため走行できません");
    } else {
      System.out.println("ナンバー" + number + "の" + type + "は" + gasoline  + "リットル分走行しました");
      this.gasoline -= gasoline;
    }
  }
  void showInfo() {
    System.out.println("車種:" + type + "ナンバー:" + number + "ガソリン" + gasoline + "リットル");
  }

}