public class AlarmClock extends Clock {
  private int alarmHour;
  private int alarmMinute;

  AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute) {
    super(hour,minute,second);
    this.alarmHour = alarmHour;
    this.alarmMinute = alarmMinute;
  }  
  public void showData() {
    super.showData();
    System.out.println("アラーム設定時刻:" + this.alarmHour + "時" + alarmMinute + "分");
  }
}