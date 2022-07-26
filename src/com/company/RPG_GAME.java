package com.company;

import kg.geektech.homework.rpg.*;

import java.util.Random;

public class RPG_GAME {
  public static Random random = new Random();
  private static int round_number;
  public static void startGame () {
    Boss boss = new Boss(1200, 50,"ZEUS");
    Warrior warrior = new Warrior(270 , 10, "LUFFY");
    Medic doc = new Medic(250, 0 ,"CHOPPER",5);
    Magic magic = new Magic(260, 15, "ZEMPHYRUS");
    Berserk berserk = new Berserk(280, 5,"BROOK");
    Medic assistant = new Medic(290 , 5, "DIO",5);
    Hero[] heroes = {warrior,doc,magic,berserk,assistant};

    printStatistics(heroes,boss);
    while (!isFightingFinished(heroes,boss)){
      playRound(heroes,boss);
    }

  }
  private static void playRound(Hero[]heroes, Boss boss){
    round_number++;
    boss.attack(heroes);
    for (int i = 0; i < heroes.length; i++) {
      heroes[i].attack(boss);
      heroes[i].applySuperPower(heroes,boss);
    }
    printStatistics(heroes,boss);

  }
  private static void printStatistics(Hero[]heroes , Boss boss){
    System.out.println(" ROUND " + round_number + " FIGHT ");
    System.out.println(boss);
    for (int i = 0; i < heroes.length; i++) {
      System.out.println(heroes[i]);
      
    }
  }
  private static boolean isFightingFinished(Hero[] heroes, Boss boss){

    if (boss.getHealth() <= 0){
      System.out.println("HEROES WON!!!");
      return true;
    }
    boolean allHeroesDead = true;
    for (int i = 0; i < heroes.length; i++) {
      if (heroes[i].getHealth() > 0){
        allHeroesDead = false;
        break;
      }
      
    }
    if (allHeroesDead){
      System.out.println("BOSS WON!!!");
  }
    return allHeroesDead;
}
}
