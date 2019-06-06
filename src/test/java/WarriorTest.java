import FantasyAdventureLab.Armour.Armour;
import FantasyAdventureLab.Armour.ArmourType;
import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.Weapons.Weapon;
import FantasyAdventureLab.Items.Weapons.WeaponType;
import FantasyAdventureLab.Players.Fighters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Enemy monster;
    Weapon sword;
    Weapon club;
    Armour helmet;
    Armour shield;
    Armour chainmail;


    @Before

    public void setUp() {
        sword = new Weapon(WeaponType.SWORD);
        club = new Weapon(WeaponType.CLUB);
        monster = new Enemy();
        warrior = new Warrior("Jack", sword);
        helmet = new Armour(ArmourType.HELMET);
        shield = new Armour(ArmourType.SHIELD);
        chainmail = new Armour(ArmourType.CHAINMAIL);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", warrior.getName());
    }

    @Test
    public void canAttack() {
        warrior.attack(monster);
        assertEquals(40, monster.getHealth());
    }

    @Test
    public void canChangeWeapon() {
        warrior.setWeapon(club);
        warrior.attack(monster);
        assertEquals(30, monster.getHealth());
    }

    @Test
    public void canDefendWithArmour() {
        warrior.addArmour(shield);
        warrior.addArmour(helmet);
        monster.attack(warrior);
        assertEquals(80, warrior.getHP());
    }
}
