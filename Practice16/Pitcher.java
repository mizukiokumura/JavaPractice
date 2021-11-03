public class Pitcher extends BaseballPlayer {
  public double era;
  Pitcher(String name, int number, double hit, double era) {
    super.name = name;
    super.uniformNumber = number;
    super.battingAverage = hit;
    this.era = era;
  }
  public void introduce() {
    System.out.println("選手名:" + super.name);
    System.out.println("背番号:" + super.uniformNumber);
    System.out.println("打率:" + super.battingAverage);
    System.out.println("防御率" + this.era);
  }
}