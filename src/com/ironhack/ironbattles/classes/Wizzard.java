package com.ironhack.ironbattles.classes;

import com.ironhack.ironbattles.interfaces.Attacker;

public class Wizzard extends Character implements Attacker {
        private int mana= (int)(Math.random()*10+1);
        private int intelligence = (int)(Math.random()*(50-1)+1);

        public Wizzard(int mana, int intelligence) {
            super();
            this.mana = mana;
            this.intelligence = intelligence;
        }

        public Wizzard(String name, int hp, int mana, int intelligence) {
        super();
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void attack(java.lang.Character character) {
        int attack = 0;
        int randomNumberAttack = (int) (Math.random() * ((10 - 1) + 1));
        if (this.mana > 5) {
            if (randomNumberAttack % 2 == 0) {
                attack = this.intelligence;
                this.mana -= 5;
                System.out.println();
            } else {
                attack = this.intelligence / 2;
                this.mana += 1;
            }
        } else if (this.mana > 2) {
            attack = this.intelligence / 2;
            this.mana += 1;
        } else {
            this.mana += 2;
        }
    }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }

        public int getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }


}


