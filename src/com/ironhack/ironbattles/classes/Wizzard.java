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


    @Override
    public void attack(java.lang.Character character) {

    }
}


