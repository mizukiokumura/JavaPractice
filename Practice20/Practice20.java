public class Practice20 {
  public static void main(String[] args) {
    SoccerPlayer fwd = new CenterForward("田村", 11);

    System.out.println(fwd);

    fwd.kickBall();
    fwd.catchBall();

    System.out.println();

    SoccerPlayer keeper = new GoalKeeper("川島", 12);
    System.out.println(keeper);

    keeper.kickBall();
    keeper.catchBall();
  }
}