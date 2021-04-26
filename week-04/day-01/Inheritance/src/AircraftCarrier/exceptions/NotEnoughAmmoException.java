package AircraftCarrier.exceptions;

public class NotEnoughAmmoException extends Exception {
  public NotEnoughAmmoException() {
    super("There are not enough ammo in the aircraft carrier!");
  }
}
