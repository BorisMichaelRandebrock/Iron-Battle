package com.ironhack.ironbattles.classes;

import com.ironhack.ironbattles.interfaces.Attacker;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
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

    public void attack(java.lang.Character character) {
        int attack = 0;
        int randomNumberAttack = (int) (Math.random() * ((10 - 1) + 1));
        if (this.stamina > 5) {
            if (randomNumberAttack % 2 == 0) {
                attack = this.strength;
                this.stamina -= 5;
                System.out.println();
            } else {
                attack = this.strength / 2;
                this.stamina += 1;
            }
        } else if (this.stamina > 2) {
            attack = this.strength / 2;
            this.stamina += 1;
        } else {
            this.stamina += 2;
        }
    }
    }

