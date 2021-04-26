package Garden.plants;

public abstract class Plant {
  protected String color;
  protected String plantType;
  protected int maxWater;
  protected double waterAmount;
  protected double absorbRate;

  public Plant(String color, String plantType, int maxWater, double absorbRate) {
    this.color = color;
    this.plantType = plantType;
    this.maxWater = maxWater;
    this.absorbRate = absorbRate;
  }

  public void shouldWater() {
    if (waterAmount >= maxWater) {
      System.out.println("The " + color + " " + plantType + " doesn't need water");
    } else {
      System.out.println("The " + color + " " + plantType + " needs water");
    }
  }

  public boolean needsWater() {
    return !(waterAmount >= maxWater);
  }

  public void water(double waterAmount) {
    if (this.waterAmount < maxWater) {
      this.waterAmount += absorbRate * waterAmount;
    }
  }
}
