public class Practice12 {
  public static void main(String[] args ) {
    Chef chef = new Chef();

    Egg egg = new Egg();
    Rice rice = new Rice();
    Milk milk = new Milk();
    Cheese cheese = new Cheese();

    System.out.println("1品目は" + chef.cook(egg, cheese) + "です");
    System.out.println("2品目は" + chef.cook(rice, egg) + "です");
    System.out.println("3品目は" + chef.cook(rice, cheese) + "です");
    System.out.println("4品目は" + chef.cook(milk, egg) + "です。");
  }
}

class Egg {}
class Rice {}
class Milk {}
class Cheese {}