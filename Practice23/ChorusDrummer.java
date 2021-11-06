public class ChorusDrummer extends Musician implements Singable, Playable {

  ChorusDrummer(String name) {
    super(name);
  }
  public void sing() {
    System.out.println( super.getName() + "はコーラスでハモりました!");
  }
  public void play() {
    System.out.println( super.getName() + "はドラムを演奏しました!");
  }
}