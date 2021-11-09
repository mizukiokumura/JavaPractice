class Boss extends Employee {
  private Subordinate sub;
  Boss(String name, Subordinate sub) {
    super.name = name;
    this.sub = sub;
  }

  public void work(String workName) {
    try {
      System.out.println("さて、今回の" + workName + "は部下の" + sub.getName() + "に任せよう!");
      sub.work(workName);
      System.out.println( sub.getName() + "君、よくやった!");
      System.out.println("さすが私の右腕だ!");
    } catch(TroubleException e) {
      System.out.println("申し訳ございません・・・");
      System.out.println(sub.getName() + "が大変失礼いたしました・・・");
      System.out.println("上司のわたくし" + super.name + "の監督不行き届きでございます・・・・");
    }
  } 
}