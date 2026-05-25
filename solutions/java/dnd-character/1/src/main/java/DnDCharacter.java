import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    private Random random = new Random();

    DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());

        this.hitpoints = 10 + modifier(constitution);
    }
    
    int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores);
        return sortedScores.get(3) + sortedScores.get(2) + sortedScores.get(1);
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(this.random.nextInt(6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
