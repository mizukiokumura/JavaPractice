class Clock {
  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void showData() {
    System.out.println("ただいまの時刻:" + hour + "時" + minute + "分" + second + "秒");
  }
}