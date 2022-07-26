package kg.geektech.homework.rpg;

public class Medic extends Hero {

    private int healPoints;
    public Medic(int health, int damage,String name, int healPoints) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }



    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
