package Garden.gardens;

import Garden.plants.Plant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public Garden(Plant plant) {
    this();
    plants.add(plant);
  }

  public Garden(Plant[] plants) {
    this();
    this.plants.addAll(Arrays.asList(plants));
  }

  public void water(int waterAmount) {
    if (waterAmount == 0) {
      System.out.println("Yeah mate, that's ain't gonna work");
      return;
    }
    System.out.println("Watering with " + waterAmount);

    double plantWater = (double) waterAmount / checkPlants();
    for (Plant plant : plants) {
      if (plant.needsWater()) {
        plant.water(plantWater);
      }
    }
    checkGarden();
  }

  public void checkGarden() {
    for (Plant plant : plants) {
      plant.shouldWater();
    }
    System.out.println();
  }

  private int checkPlants() {
    int sum = 0;
    for (Plant plant : plants) {
      if (plant.needsWater()) {
        sum++;
      }
    }
    return sum;
  }
}
