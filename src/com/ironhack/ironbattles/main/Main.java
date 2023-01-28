package com.ironhack.ironbattles.main;

import com.ironhack.ironbattles.classes.Character;
import com.ironhack.ironbattles.classes.Warrior;
import com.ironhack.ironbattles.classes.Wizzard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        createCharacters(); // method to let user create characters
    }
    public static void createCharacters() throws InterruptedException { // function to create characters through menu
        Character player1Character = null; // set character to null just to initialize variables
        Character player2Character = null;
        Scanner scanner = new Scanner(System.in); // opening scanner to get info from user

        System.out.println( //printing in console the welcoming and asking for player 1 name (character name)
                "\u001B[34m Welcome to Iron battle Simulator!\n \nAre you ready to get your friends fight for you? \n \n" +
                "so... tell me, what will be the name of your first fighter?\u001B[0m");
        String player1Name = scanner.nextLine(); // opening scanner to get the name which user give us. no filter added
        // then print message to console to ask user for player 1 class
        // sword and warrior stands for warrior class
        // staff and wizard stands for wizard class
        // any other words will make the system ask again to user
        System.out.println("\u001B[34m Aha... It's dangerous without a weapon... what will be your choice of weapon for " +player1Name + "? \n" +
                "if you are a Warrior please answer: 'sword' or 'warrior',\nif you are a Wizard, please enter: 'staff' or 'wizard`.\u001B[0m " );
        String player1Class = scanner.nextLine(); // getting data written from user (weapon or class)
        // this returns user to write properly the class or the weapon if user fails. it is not case-sensitive
        while (!player1Class.equalsIgnoreCase("sword") &&
                !player1Class.equalsIgnoreCase("warrior")
                && !player1Class.equalsIgnoreCase("staff") &&
                !player1Class.equalsIgnoreCase("wizard")){
            System.out.println("There is no such a " + player1Class + "\n What did not you understand? \n" +
                    "is this friend of yours... a warrior or a wizard?");
            player1Class = scanner.nextLine(); // ask user class if fails on introducing
        }
        // creates character with name and class that user has chosen
        if(player1Class.trim().equalsIgnoreCase("sword") ||
                player1Class.trim().equalsIgnoreCase("warrior")){
            player1Character = new Warrior(player1Name);
        } else if (player1Class.trim().equalsIgnoreCase("staff") ||
                player1Class.trim().equalsIgnoreCase("wizard")) {
            player1Character = new Wizzard(player1Name);
        }
        // asking for player 2 character. same code different variables and dialogs.
        System.out.println("\u001B[34m Ok, got it \nBut what about your opponents name?\u001B[0m " ); // ask user for name
        String player2Name = scanner.nextLine(); // getting the name written
        System.out.println("\u001B[34m Oh... yeah... Should have expect that...\n" + // print dialog and ask user for player 2 class/weapon
                "what about the weapon "+ player2Name +" will choose?\u001B[0m ");
        String player2Class = scanner.nextLine(); // getting player 2 class/ weapon
        // this returns user to write properly the class or the weapon if user fails. it is not case-sensitive
        while (!player2Class.equalsIgnoreCase("sword")
                && !player2Class.equalsIgnoreCase("warrior")
                && !player2Class.equalsIgnoreCase("staff")
                && !player2Class.equalsIgnoreCase("wizard")){
            System.out.println("There is no such a " + player2Class + "\n What did not you understand? \n" +
                    "is this friend of yours... a warrior or a wizard?");
            player2Class = scanner.nextLine();
        } // creates character with name and class that user has chosen
            if(player2Class.trim().equalsIgnoreCase("sword") || player2Class.trim().equalsIgnoreCase("warrior")){
               player2Character = new Warrior(player2Name);
            } else if (player2Class.trim().equalsIgnoreCase("staff") || player2Class.trim().equalsIgnoreCase("wizard")) {
               player2Character = new Wizzard(player2Name);
            }
            // ask user to proceed to battle or not. user have 3 possible answers none of them case sensitive
        // yes -> battle starts
        // no -> program stops running and kick user out
        // others -> program keeps you in an ask once again
        System.out.println("\u001B[34m Ok, ok... should we move on and let "+ player1Name + " and " +player2Name +
                "\nfight just because you have decided to be? \n" +
                "give a simple answer... don't make me come back again... Yes or yes? \u001B[0m ");
            String battleStarts = scanner.nextLine(); // storing users response
            while (!battleStarts.equalsIgnoreCase("yes") && !battleStarts.equalsIgnoreCase("no")){
                System.out.println("... I'm starting to be tired of your stupid answers" +
                        "\n So... once again... wanna start this bloody fight? Yes or Yes?");
                battleStarts = scanner.nextLine();
            }

        System.out.println("\u001B[35m" +  player1Character.getName() +"\u001B[0m" + "\u001B[31m : You killed my father....\u001B[0m  💀");
        Thread.sleep(500);

        System.out.println("\u001B[35m" + player2Character.getName() + "\u001B[0m" + "\u001B[31m : ....prepare to die\u001B[0m  🪦😇");
        Thread.sleep(500);

        switch (battleStarts.toLowerCase()){
                case "yes": // battle starts
                    battleMethod(player1Character,player2Character);
                    break;
                case "no": // system kick user off
                    System.out.println("ok... get the f*** out of here!!! spending time for nothing -.-");
                    break;
            }
            scanner.close(); // closing scanner once function finished.
    }
    public static void checkHealth(Character player1, Character player2){
        if (player1.getHp()<=0 && player2.getHp()>0){
            System.out.println("\u001B[35m" + player2.getName() + "\u001B[0m:" + "\u001B[31m hahaha you weak little bastard!\u001B[0m \n" + "\u001B[35m"+ player1.getName() + "\u001B[0m:" + "\u001B[31m aaaargh...  i am dying\u001B 👼🏻");
        } else if (player2.getHp()<=0 && player1.getHp()>0){
            System.out.println("\u001B[35m" + player1.getName() + "\u001B[0m:" + "\u001B[31m i told you! i would win!!!! \u001B[0m \n" + "\u001B[35m" + player2.getName() +"\u001B[0m:" + "\u001B[31m aaaargh...  i am dying\u001B 👼🏻");
        }  else{
            System.out.println("\u001B[31m I Think we had enough... lets go for a beer ...\u001B🍻");
        }
    }
    public static void battleMethod(Character player1, Character player2) throws InterruptedException {
        while(player1.getHp()> 0 && player2.getHp()>0){
            Thread.sleep(500);
            player1.attack(player2);
            Thread.sleep(500);
            player2.attack(player1);
            Thread.sleep(500);
            System.out.println("\u001B[34mwhat a bloody round. It left our opponents with: \n" + player1.getName() + ":  " + player1.getHp() +
                    "\n" + player2.getName() + ": " + player2.getHp() +"\u001B[0m " );
            System.out.println("\u001B[33m ===================================================== \u001B[0m");

        }
        checkHealth(player1, player2);
    }
}
