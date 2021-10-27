public class Practice9 {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setData(1234,"山田");
    
    System.out.println("社員番号:" + employee.getId());

    System.out.println("社員名:" + employee.getName());
  }
}

//  class Employee {
//   private int companyNumber = 0;
//   private String companyName = ""; 

//   void setData(int number, String name) {
//     companyNumber = number;
//     companyName = name;
//   }
//   public int getId() {
//     return this.companyNumber;
//   } 
//   public String getName() {
//     return this.companyName;
//   }
// }