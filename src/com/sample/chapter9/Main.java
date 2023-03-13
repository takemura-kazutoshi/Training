package com.sample.chapter9;

public class Main {

//    public static void main(String[] args) {
//        Sword s = new Sword();
//        s.name = "炎の剣";
//        s.damage = 10;
//
//        Hero h1 = new Hero();
//        h1.name = "まあさ";
//        h1.hp = 100;
//        h1.sword = s;
//        System.out.println("現在の武器は" + s.name);
//
//        Hero h2 = new Hero();
//        h2.name = "hoge";
//        h2.hp = 100;
//
//        Wizard w = new Wizard();
//        w.name = "hogehoge";
//        w.hp = 50;
//    }

    public static void heal(int hp) {
        hp += 10;
    }

    public static void heal(Thief thief) {
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp);
        System.out.println(baseHp + ":" + t.hp);
        heal(baseHp);
        heal(t);
        System.out.println(baseHp + ":" + t.hp);
    }

}
