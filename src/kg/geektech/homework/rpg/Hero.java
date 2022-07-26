package kg.geektech.homework.rpg;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility abilityType;
    public Hero(int health, int damage ,String name, SuperAbility abilityType) {
        super(health, damage, name);
        this.abilityType = abilityType;
    }

    public SuperAbility getAbilityType() {
        return abilityType;
    }
    public void attack(Boss boss){
        boss.setHealth(getHealth() - getDamage());
    }
}

