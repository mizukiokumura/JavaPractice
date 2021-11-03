public class Practice15 {
  public static void main(String[] args) {
    System.out.println("ロボット総生産数:" + Robot.getTotal());

    Robot[] robots = {
      new Robot("RX"),
      new Robot("PZ"),
      new Robot("SS"),
      new Robot("FG"),
      new Robot("VC"),
      null
    };

    System.out.println("ロボット総生産数:" + Robot.getTotal());

    robots[5] = new Robot("SUPER-Z");

    System.out.println("ロボット総生産数:" + Robot.getTotal());

    System.out.println();

    for(int i = 0; i < robots.length; i++){
      robots[i].introduce();
    }
  }
}