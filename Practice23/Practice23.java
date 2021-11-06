public class Practice23 {
  public static void main(String[] args) {
    Musician[] band = {
    new Vocalist("桜井"),
    new Guitarist("田原", "リードギター"),
    new Guitarist("中川", "ベース"),
    new ChorusDrummer("鈴木")
    };

    for (Musician musician : band ) {
      if(musician instanceof Singable && musician instanceof Playable) {
        ChorusDrummer cD = (ChorusDrummer)musician;
        cD.sing();
        cD.play();
      } else if (musician instanceof Singable ) {
        Vocalist vocal = (Vocalist)musician;
        vocal.sing();
      } else {
        Guitarist guitar = (Guitarist)musician;
        guitar.play();
      }
    }
  }
}