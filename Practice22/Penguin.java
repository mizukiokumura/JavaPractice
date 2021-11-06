public class Penguin extends Bird implements Swimable {
  public void swim() {
    System.out.println("ペンギンがスイスイ泳いでいます。");
  }
  public void eat() {
    System.out.println("ペンギンが魚を食べました");
  }
}