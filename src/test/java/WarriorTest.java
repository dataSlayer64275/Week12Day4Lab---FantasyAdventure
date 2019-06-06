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

    @Before

    public void setUp() {
        sword = new Weapon(WeaponType.SWORD);
        monster = new Enemy();
        warrior = new Warrior("Jack", sword);
    }

    @Test
    public void canAttack() {
        warrior.attack(monster);
        assertEquals(40, monster.getHealth());
    }
}
