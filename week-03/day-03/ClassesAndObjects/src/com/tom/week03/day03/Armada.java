package com.tom.week03.day03;

import java.util.ArrayList;

public class Armada {
  private ArrayList<Ship> ships = new ArrayList<>();

  public Armada() {
    this((int) (Math.random() * 100));
  }

  public Armada(int num) {
    for (int i = 0; i < num; i++) {
      Ship ship = new Ship();
      ship.fillShip();
      ships.add(ship);
    }
  }

  public boolean war(Armada armada) {
    while (hasShips() && armada.hasShips()) {
      if (nextShip().battle(armada.nextShip())) {
        armada.nextShip().destroy();
      } else {
        nextShip().destroy();
      }
    }
    return hasShips();
  }

  public boolean hasShips() {
    for (Ship ship : ships) {
      if (!ship.isDestroyed()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Armada has " + remainingShips() + " ships.";
  }

  private Ship nextShip() {
    for (Ship ship : ships) {
      if (!ship.isDestroyed()) {
        return ship;
      }
    }
    return null;
  }

  private int remainingShips() {
    int sum = 0;
    for (Ship ship : ships) {
      if (!ship.isDestroyed()) {
        sum++;
      }
    }
    return sum;
  }
}
