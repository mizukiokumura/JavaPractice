public class Person {
  private String name;
  private int age;

  public void setData(String name, int age) {
    this.name = name;
    this.age = age;

  }

  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }

  public void introduce() {
    System.out.println("わたしの名前は" + this.name + "、年齢は" + this.age + "です。");
  }
  
  public void compare(Person human) {
    int ageGap = this.age - human.getAge();
    if (ageGap == 0) {
      System.out.println("わたくし" + this.name + "は、" + human.getName() + "さんと同じ年齢です" );
    } else if (ageGap > 0) {
      System.out.println("わたくし" + this.name + "は、" + human.getName() + "さんより" + ageGap + "歳年上です");
    } else {
      System.out.println("わたくし" + this.name + "は、" + human.getName() + "さんより" + Math.abs(ageGap) + "歳年下です");
    }
  } 
}