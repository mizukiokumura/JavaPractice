class GoalKeeper extends SoccerPlayer {
  final String POSITION_NAME = "ゴールキーパー";
  GoalKeeper(String name, int number) {
    super(name, number);
  } 
  public String getPositionName() {
    return POSITION_NAME;
  }

  public void catchBall() {
    System.out.println(super.getName() + "はボールを手で受け止めました");
  }
}