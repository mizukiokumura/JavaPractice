public class Guitarist extends Musician implements Playable {
  public String guitarType;

  Guitarist(String name, String type) {
    super(name);
    this.guitarType = type;
  }

  public void play() {
    System.out.println( super.getName() + "は" + this.guitarType + "を演奏しました!");
  }
}