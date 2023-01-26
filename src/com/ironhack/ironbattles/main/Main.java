package com.ironhack.ironbattles.main;

import com.ironhack.ironbattles.classes.Character;
import com.ironhack.ironbattles.classes.Warrior;
import com.ironhack.ironbattles.classes.Wizzard;

public class Main {
    public static void main(String[] args) {

        Character player1= new Warrior("Aragorn");
        Character player2= new Wizzard("Saruman");
        System.out.println(player1.getName() + " You killed my father....");
        System.out.println(player2.getName() + " ....prepare to die 😇");

        battleMethod(player1,player2);
    }
    public static void checkHealth(Character player1, Character player2){
        if (player1.getHp()<=0 && player2.getHp()>0){
            System.out.println(player2.getName() + " hahaha you weak little bastard!\n" +  player1.getName() + " i am dying");
        } else if (player2.getHp()<=0 && player1.getHp()>0){
            System.out.println(player1.getName() + " i told you! i would win!!!! \n" +  player2.getName() + " i am dying");
        }  else{
            System.out.println("Its a tie");
        }
    }
    public static void battleMethod(Character player1, Character player2){
        while(player1.getHp()> 0 && player2.getHp()>0){
            player1.attack(player2);
            player2.attack(player1);
            System.out.println("what a bloody round. It left our opponents with: \n" + player1.getName() + ": " + player1.getHp() +
                    "\n" + player2.getName() + ": " + player2.getHp());
            System.out.println("\u001B[33m ===================================================== \u001B[0m");

        }
        checkHealth(player1, player2);
    }
}
