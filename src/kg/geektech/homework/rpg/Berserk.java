package kg.geektech.homework.rpg;

public class Berserk extends Hero {

    private int savedDamage;
    public Berserk(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
