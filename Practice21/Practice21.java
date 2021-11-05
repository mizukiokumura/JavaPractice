public class Practice21 {
  public static void main(String[] args) {
    Athlete[] athlete = {
      new Swimmer("北島光一"),
      new MarathonRunner("髙橋昭子"),
      new Swimmer("岩崎正子"),
      new MarathonRunner("野口みきえ")
    };

    for(int i = 0; i < athlete.length; i++) {
      System.out.println(athlete[i]);
    }
    System.out.println();

    for(Athlete human : athlete) {
      Swimmer s = new Swimmer("武田");
      if(human.getClass() == s.getClass()) {
        Swimmer hu = (Swimmer)human;
        hu.swim();
      } else {
        MarathonRunner hum = (MarathonRunner)human;
        hum.run();
      }
    }
  }
}