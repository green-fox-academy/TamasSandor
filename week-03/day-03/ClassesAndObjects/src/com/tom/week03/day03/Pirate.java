package com.tom.week03.day03;

public class Pirate {
  public boolean isAlive = true;
  private boolean hasParrot = false;
  private int alcoholLevel;

  public void howsItGoingMate() {
    if (alive()) {
      if (alcoholLevel < 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        passOut();
      }
    }
  }

  public void brawl(Pirate pirate) {
    if (alive() && pirate.alive()) {
      double rand = Math.random();
      if (rand < 0.33) {
        this.die();
      } else if (rand < 0.66) {
        pirate.die();
      } else {
        passOut();
        pirate.passOut();
      }
    }
  }

  public void drinkSomeRum() {
    this.alcoholLevel++;
  }

  public int getAlcoholLevel() {
    return alcoholLevel;
  }

  public boolean alive() {
    if (!isAlive) {
      System.out.println("he's dead");
    }
    return isAlive;
  }

  public void die() {
    if (alive()) {
      isAlive = false;
    }
  }

  private void passOut() {
    if (alive()) {
      alcoholLevel = 0;
    }
  }
}
