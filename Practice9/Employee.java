public class Employee {
  private int companyNumber = 0;
  private String companyName; 

  void setData(int number, String name) {
    companyNumber = number;
    companyName = name;
  }
  public int getId() {
    return this.companyNumber;
  } 
  public String getName() {
    return this.companyName;
  }
}