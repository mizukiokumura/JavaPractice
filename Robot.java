public class Robot {
  public int id = 0;
  public String name = "";
  public static int total = 0;
  Robot(String name) {
    this.name = name;
    this.total++;
    this.id = this.total;
  }
  static int getTotal() {
    return total;
  }
  void introduce() {
    System.out.println("ID:" + this.id + "NAME:" + this.name);
  }
}