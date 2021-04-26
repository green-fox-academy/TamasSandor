package AircraftCarrier;

import AircraftCarrier.aircrafts.AirCraft;
import AircraftCarrier.aircrafts.F16;
import AircraftCarrier.aircrafts.F35;
import AircraftCarrier.carriers.Carrier;
import AircraftCarrier.exceptions.NotEnoughAmmoException;

public class Main {
  public static void main(String[] args) {
    Carrier USS_Enterprise = new Carrier(2300, 5000);
    USS_Enterprise.addAll(new AirCraft[] {
        new F35(),
        new F35(),
        new F35(),
        new F16(),
        new F16()
    });

    try {
      USS_Enterprise.fill();
    } catch (NotEnoughAmmoException e) {
      System.err.println(e.getMessage());
    }
    System.out.println(USS_Enterprise.getStatus());
  }
}
