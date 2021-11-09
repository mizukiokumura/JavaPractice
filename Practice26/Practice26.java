public class Practice26 {
  public static void main(String[] args) {
    Subordinate sub = new Subordinate("有吉");
    Boss boss = new Boss("上島", sub);

    boss.work("得意先との取引");
  }
}