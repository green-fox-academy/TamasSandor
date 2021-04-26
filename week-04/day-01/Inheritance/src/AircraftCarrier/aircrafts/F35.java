package AircraftCarrier.aircrafts;

public class F35 extends AirCraft {
  public F35() {
    super(12, 50);
  }

  public String getType() {
    return F35.class.getSimpleName();
  }
}
