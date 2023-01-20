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

    public void attack(java.lang.Character character) {
/*
A public function that overloads attack() implemented in the Attacker interface,
that will take a character as a parameter and reduce that character’s health based on the strength of the attack.
 */

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
