package kg.geektech.homework.rpg;

public class Warrior extends Hero {


    public Warrior(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.CRITICAL_DAMAGE);
    }



    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
