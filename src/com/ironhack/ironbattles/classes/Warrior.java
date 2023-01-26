package com.ironhack.ironbattles.classes;
import com.ironhack.ironbattles.interfaces.Attacker;

public class Warrior extends Character implements Attacker {
    private int stamina=(int)(Math.random()*50+10);
    private int strength=(int)(Math.random()*10+1);

    public Warrior(String name) {
        super(name, (int)(Math.random()*200+100));
    }
    @Override
    public void attack(Character character) {
        int randomNumberAttack = (int) (Math.random() * ((10 - 1) + 1));
        if (this.stamina > 5) {
            if (randomNumberAttack % 2 == 0) {
                character.setHp(character.getHp()-this.strength);
                this.stamina -= 5;
                System.out.println(getName() + ":\u001B[31m have a taste of my sword\u001B[0m ⚔️");
            } else {
                character.setHp(character.getHp()-this.strength/2);
                this.stamina += 1;
                System.out.println(getName() + ":\u001B[31m take this kick\u001B[0m \uD83E\uDDB6");
            }
        } else if (this.stamina > 2) {
            character.setHp(character.getHp()-this.strength/2);
            this.stamina += 1;
            System.out.println(getName() + ":\u001B[31m take this punch\u001B[0m \uD83E\uDD1B");
        } else {
            this.stamina += 2;
            System.out.println(getName() + ":\u001B[31m do you think you can defeat me?\u001B[0m");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}

