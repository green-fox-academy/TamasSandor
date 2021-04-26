package Garden;

import Garden.gardens.Garden;
import Garden.plants.Flower;
import Garden.plants.Plant;
import Garden.plants.Tree;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden(new Plant[] {
        new Flower("yellow"),
        new Flower("blue"),
        new Tree("purple"),
        new Tree("orange")
    });

    garden.checkGarden();
    garden.water(40);
    garden.water(70);
  }
}
