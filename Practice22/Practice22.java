public class Practice22 {
  public static void main(String[] args) {
    Bird[] birds = {new Swallow(), new Penguin(), new Atthis()};

    for(Bird bird : birds) {
      bird.eat();
      if(bird instanceof Flyable && bird instanceof Swimable) {
        Atthis kawasemi = (Atthis)bird;
        kawasemi.fly();
        kawasemi.swim();
      } else if ( bird instanceof Flyable ) {
        Swallow tubame =  (Swallow)bird;
        tubame.fly();
      } else {
        Penguin pengin = (Penguin)bird;
        pengin.swim();
      }
      System.out.println();
    }
  }
}