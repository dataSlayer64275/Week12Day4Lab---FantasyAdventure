import FantasyAdventureLab.Defenders.Defender;
import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.Spells.Spell;
import FantasyAdventureLab.Items.Spells.SpellType;
import FantasyAdventureLab.Players.Spellcasters.Warlock;
import FantasyAdventureLab.Players.Spellcasters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell fireball;
    Spell wrathOfSri;
    Spell lightningStrike;
    Enemy monster;
    Warlock warlock;
    Defender defender;

    @Before

    public void setUp() {
        fireball = new Spell(SpellType.FIREBALL);
        wrathOfSri = new Spell(SpellType.WRATHOFSRI);
        lightningStrike = new Spell(SpellType.LIGHTNINGSTRIKE);
        monster = new Enemy();
        wizard = new Wizard("Trevor", fireball);
        defender = new Defender();
        warlock = new Warlock("Warlo", lightningStrike, defender);

    }

    @Test
    public void hasName() {
        assertEquals("Trevor", wizard.getName());
    }

    @Test
    public void canCastSpell() {
        wizard.cast(monster);
        assertEquals(50, monster.getHealth());
    }

    @Test
    public void canChangeSpell() {
        wizard.setISpell(lightningStrike);
        wizard.cast(monster);
        assertEquals(40, monster.getHealth());
    }

    @Test
    public void canDefend() {
        monster.attack(warlock);
        assertEquals(100, warlock.getHP());
        assertEquals(50, defender.getHealth());
    }
}
