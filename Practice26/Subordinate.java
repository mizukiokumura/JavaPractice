import java.util.*;
class Subordinate extends Employee {
  Subordinate(String name) {
    super.name = name;
  } 
  public String getName() {
    return super.name;
  }
  public void work(String workName) throws TroubleException {
    System.out.println("今回の" + workName + "は" + "わたくし" + this.getName() + "が担当いたします");
    System.out.println( workName + "中・・・");
    Random r = new Random();
    boolean oko = r.nextBoolean();
    if(oko) {
      System.out.println("ふざけるな、バカ野郎!");
      throw new TroubleException();
    } else {
      System.out.println("今回の" + workName + "はわたくし" + this.getName() + "が無事任務を果たしました");
    }
  }
}