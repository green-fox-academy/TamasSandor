package AircraftCarrier.aircrafts;

public class F16 extends AirCraft {
  public F16() {
    super(8, 30);
  }

  public String getType() {
    return F16.class.getSimpleName();
  }
}
