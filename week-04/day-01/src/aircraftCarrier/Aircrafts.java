package aircraftCarrier;

public class Aircrafts {
  protected int maxAmmo;
  protected int baseDamage;

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}



  /*Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircrafts should keep track of their ammunition*/

  /* F16
        Max ammo: 8
        Base damage: 30
      F35
        Max ammo: 12
        Base damage: 50
      All aircrafts should be created with an empty ammo storage*/

  /*Methods
      fight
  It should use all the ammo (set it to 0) and it should return the damage it deals
    The damage dealt is calculated by multiplying the base damage by the ammunition
    refill
    It should take a number as parameter and subtract as much ammo as possible
    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
    It should return the remaining ammo
    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    getType
    It should return the type of the aircraft as a string
    getStatus
    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    isPriority
    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/