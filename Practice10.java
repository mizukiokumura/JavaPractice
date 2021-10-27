public class Practice10 {
  public static void main(String[] args) {
    Pet pet1 = new Pet();

    pet1.setType("犬");
    pet1.setName("コタロー");
    pet1.setAge((byte)4);
    pet1.setGender(false);

    Pet pet2 = new Pet();

    pet2.setType("猫");
    pet2.setName("ミー");
    pet2.setAge((byte)2);
    pet2.setGender(true);

    System.out.println(pet1.getIntroduction());
    System.out.println(pet2.getIntroduction());
  }
}