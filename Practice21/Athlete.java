abstract class Athlete {
  protected String name;
  public abstract String getType();

  
  public String toString() {
    return "私の名前は" + name + getType() + "の選手です。";
  }
}