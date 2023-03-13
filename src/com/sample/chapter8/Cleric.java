package com.sample.chapter8;

import java.util.Random;

public class Cleric {

    String name = "Cleric";
    int HP;
    final int maxHP = 50;
    int MP;
    final int maxMP = 10;

    public void selfAid() {
        this.MP = this.MP-5;
        this.HP = this.maxHP;
    }

    public int pray(int praySec) {
        Random rand = new Random();
        int aidVol = praySec + rand.nextInt(3);
//        if (aidVol >= 50) {
//            aidVol = this.maxHP;
//        }
        // 実際の回復量を最小値関数で算出
        return Math.min(aidVol - this.HP, aidVol);
    }
}
