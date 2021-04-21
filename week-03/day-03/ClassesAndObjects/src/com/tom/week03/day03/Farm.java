package com.tom.week03.day03;

import java.util.ArrayList;

public class Farm {
  private ArrayList<Animal> animals = new ArrayList<>();
  private int limit;

  public Farm(int limit) {
    this.limit = limit;
  }

  public void breed(Animal animal) {
    if (animals.size() < limit) {
      animals.add(animal);
    }
  }

  public void sell(){
    Animal animal = animals.get(0);
    for (Animal a: animals) {
      if (a.getHunger() > animal.getHunger()) {
        animal = a;
      }
    }
    animals.remove(animal);
  }
}
