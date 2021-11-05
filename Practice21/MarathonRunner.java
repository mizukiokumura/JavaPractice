class MarathonRunner extends Athlete {
  public static final String TYPE = "マラソン";

  MarathonRunner(String name) {
    super.name = name;
  }

  public String getType() {
    return this.TYPE;
  }

  public void run() {
    System.out.println(super.name + "は走りました");
  }

}