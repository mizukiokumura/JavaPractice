class Swimmer extends Athlete {
  public static final String TYPE ="水泳";

  Swimmer(String name) { 
    super.name = name;

  }
  
  public String getType() {
    return this.TYPE;
  }

  public void swim() {
    System.out.println(super.name + "は泳ぎました。");
  }

}