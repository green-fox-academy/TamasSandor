package AircraftCarrier.carriers;

import AircraftCarrier.exceptions.NotEnoughAmmoException;
import AircraftCarrier.aircrafts.AirCraft;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrier {
  private List<AirCraft> airCrafts;
  private int ammoAmount;
  private int health;

  public Carrier(int ammoAmount, int health) {
    this.airCrafts = new ArrayList<>();
    this.ammoAmount = ammoAmount;
    this.health = health;
  }

  public void add(AirCraft aircraft) {
    this.airCrafts.add(aircraft);
  }

  public void addAll(AirCraft[] airCrafts) {
    this.airCrafts.addAll(Arrays.asList(airCrafts));
  }

  public void fill() throws NotEnoughAmmoException {
    if (ammoAmount == 0) {
      throw new NotEnoughAmmoException();
    } else {
      loadAirCrafts(!isAmmoEnough());
    }
  }

  public void fight(Carrier carrier) {
    int sumDamage = 0;
    for (AirCraft aircraft : airCrafts) {
      sumDamage += aircraft.fight();
    }
    carrier.damage(sumDamage);
  }

  public String getStatus() {
    if (health == 0) {
      return "It's dead Jim :(";
    }
    String status = "";

    status += "HP: " + health + ", Aircraft count: " + airCrafts.size() + ", Ammo Storage: " +
        ammoAmount + ", Total damage: " + totalDamage();

    status += "\nAircrafts:\n";

    for (AirCraft aircraft : airCrafts) {
      status += aircraft.getStatus() + "\n";
    }
    return status;
  }

  private int totalDamage() {
    int sumDamage = 0;
    for (AirCraft aircraft : airCrafts) {
      sumDamage += aircraft.totalDamage();
    }
    return sumDamage;
  }

  private void damage(int damageAmount) {
    if (damageAmount > health) {
      health = 0;
    } else {
      health -= damageAmount;
    }
  }

  private boolean isAmmoEnough() {
    int neededAmmo = 0;
    for (AirCraft aircraft : airCrafts) {
      neededAmmo += aircraft.neededAmmo();
    }
    return ammoAmount > neededAmmo;
  }

  private void loadAirCrafts(boolean isPriority) {
    if (isPriority) {
      for (AirCraft aircraft : airCrafts) {
        if (aircraft.isPriority()) {
          ammoAmount = aircraft.refillAmmo(ammoAmount);
        }
      }
      for (AirCraft aircraft : airCrafts) {
        if (!aircraft.isPriority()) {
          ammoAmount = aircraft.refillAmmo(ammoAmount);
        }
      }
    } else {
      for (AirCraft aircraft : airCrafts) {
        ammoAmount = aircraft.refillAmmo(ammoAmount);
      }
    }
  }
}
