package aircraftCarrier;

public class F16 extends Aircrafts{

  public F16() {
    super();
    super.baseDamage = 30;
    super.maxAmmo = 8;
  }
}

/* F16
        Max ammo: 8
        Base damage: 30
      F35
        Max ammo: 12
        Base damage: 50
      All aircrafts should be created with an empty ammo storage*/