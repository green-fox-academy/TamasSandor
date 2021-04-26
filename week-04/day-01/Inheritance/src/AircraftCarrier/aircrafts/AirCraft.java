package AircraftCarrier.aircrafts;

public abstract class AirCraft {
  protected int maxAmmo;
  protected int ammo;
  protected int baseDamage;

  public AirCraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public int fight() {
    int tempAmmo = ammo;
    ammo = 0;
    return tempAmmo * baseDamage;
  }

  public int refillAmmo(int ammo) {
    int capacity = maxAmmo - this.ammo;
    if (capacity >= ammo) {
      this.ammo = ammo;
      return 0;
    } else {
      this.ammo = maxAmmo;
      return ammo - capacity;
    }
  }

  public abstract String getType();

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammo + ", Base Damage: " + baseDamage +
        ", All Damage: " + (ammo * baseDamage);
  }

  public boolean isPriority() {
    return this instanceof F35;
  }

  public int neededAmmo() {
    return maxAmmo - ammo;
  }

  public int totalDamage() {
    return ammo * baseDamage;
  }
}
