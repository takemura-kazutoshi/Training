package com.sample.chapter10;

public class PoisonMatango extends Matango{
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            float damage = h.hp/5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount -= 1;
        }
    }
}
