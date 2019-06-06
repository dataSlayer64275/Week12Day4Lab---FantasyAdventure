package FantasyAdventureLab.Items.Weapons;

public enum WeaponType {
    AXE( 50),
    SWORD(60),
    CLUB(70);

    private final int damage;

        WeaponType(int damage){
            this.damage = damage;
        }

        public int getDamageByType () {
            return this.damage;
        }
    }
