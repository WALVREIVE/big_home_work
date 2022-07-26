package kg.geektech.homework.rpg;

import com.company.RPG_GAME;

public class Boss extends GameEntity {
    private SuperAbility defenceType;
    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefenceType() {
        return defenceType;
    }
    public void SelectDefence(Hero[] heroes){
        int randomIndex = RPG_GAME.random.nextInt(heroes.length);
        this.defenceType = heroes[randomIndex] .getAbilityType();


    }
    public void attack(Hero[]heroes){
        for (int i = 0; i < heroes.length; i++) {
           heroes[i].setHealth( heroes[i].getHealth() - this.getDamage());
            
        }
    }
}

