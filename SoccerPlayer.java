abstract class SoccerPlayer {
  private String name;
  private int uniformNumber;
  SoccerPlayer(String name, int number) {
    this.name = name;
    this.uniformNumber = number;
  }
  public String getName() {
    return this.name;
  }
  public void kickBall() {
    System.out.println(this.name + "はボールを蹴りました。");
  }
  public void catchBall() {
    System.out.println(this.name + "はボールを足で受け止めました");
  }
  public abstract String getPositionName() ;
  public String toString() {
    return this.getPositionName() + " " + this.name + " " + "背番号" + this.uniformNumber;
  }
}