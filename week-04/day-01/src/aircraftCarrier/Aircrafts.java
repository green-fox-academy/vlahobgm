package aircraftCarrier;

public class Aircrafts {
  protected int maxAmmo;
  protected int baseDamage;
  protected int currentAmmo;
  protected String type;

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

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int fight() {
    this.currentAmmo = 0;
    return this.baseDamage * this.maxAmmo;
  }

  public int refill(int refillAmount) {
    if (refillAmount < this.maxAmmo) {
      this.currentAmmo += refillAmount;
      return this.currentAmmo;
    } else {
      this.currentAmmo = this.maxAmmo;
      return refillAmount - this.maxAmmo;
    }
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
  /*getStatus
  It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500*/
  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + getBaseDamage()
        + ", All" + " Damage: " + fight();
  }

  /*isPriority
  It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/
  public boolean isPriority() {
    if (getType() == "F35") {
      return true;
    }else {
      return false;
    }
  }
}

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

    isPriority
      It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/