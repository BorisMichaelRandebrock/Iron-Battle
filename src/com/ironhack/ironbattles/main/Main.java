package com.ironhack.ironbattles.main;

import com.ironhack.ironbattles.classes.Character;

public class Main {
    public static void main(String[] args) {
        System.out.println("You killed my father....");
        System.out.println("....prepare to die 😇");

    }

    public static void checkHealth(Character player1, Character player2){
        if (player1.getHp()<=0 && player2.getHp()>0){
            System.out.println("Player 2 has won");
        } else if (player2.getHp()<=0 && player1.getHp()>0){
            System.out.println("Player 1 has won");
        }  else{
            System.out.println("Its a tie");
        }
    }
    public static void battleMethod(Character player1, Character player2){
        while(player1.getHp()> 0 && player2.getHp()>0){
            player1.attack(player2);
            player2.attack(player1);
            System.out.println("Next Round!!");
        }
        checkHealth(player1, player2);
    }
}
