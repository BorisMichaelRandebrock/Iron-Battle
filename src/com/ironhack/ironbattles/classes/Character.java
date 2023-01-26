package com.ironhack.ironbattles.classes;

import com.ironhack.ironbattles.interfaces.Attacker;

public abstract class Character implements Attacker {
    private String id=(String)"Character"+(Math.random()*999+1);
    private String name;
    private int hp;
    private boolean isAlive = true;

    public Character(String name, int hp) {
        this.name = name;
        this.hp= hp;
    }

    public void attack(Character character) {
        System.out.println("No te esperes caricias");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
