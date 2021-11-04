public class Practice19 {
  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    Cat cat = new Cat();
    Bird bird = new Bird();
    Dog dog = new Dog();

    animals[0] = dog;
    animals[1] = bird;
    animals[2] = cat;
    for(Animal animal : animals) {
      animal.sing();
    }
  }
}