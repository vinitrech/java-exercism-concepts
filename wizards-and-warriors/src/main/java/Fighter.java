abstract class Fighter {

    boolean isVulnerable() {
        return true;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) {
            return 10;
        }

        return 6;
    }
}

class Wizard extends Fighter {
    private boolean spellInAdvance = false;

    @Override
    boolean isVulnerable() {
        if (spellInAdvance) {
            return false;
        }

        return true;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spellInAdvance) {
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        this.spellInAdvance = true;
    }

}
