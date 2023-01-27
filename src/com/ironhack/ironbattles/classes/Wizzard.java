package com.ironhack.ironbattles.classes;
import com.ironhack.ironbattles.interfaces.Attacker;
import com.ironhack.ironbattles.classes.Character;

public class Wizzard extends Character implements Attacker {
        private int mana= (int)(Math.random()*50+10);
        private int intelligence = (int)(Math.random()*50+1);

        public Wizzard(String name) {
            super(name, (int)(Math.random()*100+50));
        }

        @Override
        public void attack(Character character) {
        int randomNumberAttack = (int) (Math.random() * ((10 - 1) + 1));
        if (this.mana > 5) {
            if (randomNumberAttack % 2 == 0) {
                character.setHp(character.getHp()-this.intelligence);
                this.mana -= 5;
                System.out.println("\u001B[35m" + getName() + "\u001B[0m" + ":\u001B[31m take this fireball \u001B[0m☄️");
            } else {
                character.setHp(character.getHp()-this.intelligence/2);
                this.mana += 1;
                System.out.println("\u001B[35m" + getName() + "\u001B[0m" + ":\u001B[31m take this hit with my staff\u001B[0m \uD83E\uDE84");
            }
        } else if (this.mana > 2) {
            character.setHp(character.getHp()-this.intelligence/2);
            this.mana += 1;
            System.out.println("\u001B[35m" + getName() + "\u001B[0m" + ":\u001B[31m get this rock!!\u001B[0m \uD83E\uDEA8 ");
        } else {
            this.mana += 2;
            System.out.println("\u001B[35m" + getName() + "\u001B[0m" + ": \u001B[31m where are you? you can run but you can't hide!!\u001B[0m");
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


