public class Vocalist extends Musician implements Singable {

  Vocalist(String name) {
    super(name);
  }

  public void sing() {
    System.out.println( super.getName() + "は熱唱しました!");
  }
}