class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

    public String toString() {
        return "Is a Fighter";
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellReady = false;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !this.spellReady;
    }
    
    void prepareSpell() {
        this.spellReady = true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.spellReady ? 12 : 3;
    }
}