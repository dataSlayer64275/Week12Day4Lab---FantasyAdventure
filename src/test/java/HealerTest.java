import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.HealingTools.HealingTool;
import FantasyAdventureLab.Items.HealingTools.HealingType;
import FantasyAdventureLab.Items.Weapons.Weapon;
import FantasyAdventureLab.Items.Weapons.WeaponType;
import FantasyAdventureLab.Players.Fighters.Warrior;
import FantasyAdventureLab.Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    HealingTool smallPotion;
    HealingTool largePotion;
    Cleric healer;
    Enemy monster;
    Warrior warrior;
    Weapon club;

    @Before

    public void setUp() {
        smallPotion = new HealingTool(HealingType.POTIONSMALL);
        largePotion = new HealingTool(HealingType.POTIONLARGE);
        healer = new Cleric("Clericus", smallPotion);
        monster = new Enemy();
        warrior = new Warrior("Vanessa", club);
        club = new Weapon(WeaponType.CLUB);
    }

    @Test
    public void hasName() {
        assertEquals("Clericus", healer.getName());
    }

    @Test
    public void canHealSelf() {
        monster.attack(healer);
        healer.heal(healer);
        assertEquals(90, healer.getHP());
    }

    @Test
    public void canHealOtherPlayer() {
        monster.attack(warrior);
        healer.heal(warrior);
        assertEquals(90, warrior.getHP());
    }

    @Test
    public void canChangeHealingItem() {
        healer.setHealingTool(largePotion);
        monster.attack(warrior);
        healer.heal(warrior);
        assertEquals(150, warrior.getHP());
    }
}
