public class Magazine extends Book {
  private String coverPersonName;
  Magazine(String title, int price, String coverPersonName) {
    super(title, price);
    this.coverPersonName = coverPersonName;
  }

  public void show() {
    System.out.println(super.getTitle() + "絶賛発売中!!");
    System.out.println("定価" + super.getPrice() + "円");
    System.out.println("今回の表紙:" + this.coverPersonName + "さん");
  }
}