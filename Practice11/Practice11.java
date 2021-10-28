public class Practice11 {
  public static void main(String[] args) {
    Person[] persons = {new Person(), new Person(), new Person()};

    persons[0].setData("大島", 30);
    persons[1].setData("村上", 30);
    persons[2].setData("黒沢", 32);

    for(int i = 0; i < persons.length; i++) {
      persons[i].introduce();
    }

    System.out.println();
    persons[0].compare(persons[1]);
    persons[1].compare(persons[2]);
    persons[2].compare(persons[1]);
  }
}