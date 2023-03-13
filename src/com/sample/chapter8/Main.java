package com.sample.chapter8;

public class Main {
    public static void main(String[] args) {
        // 勇者を生み出す
        Hero h = new Hero();

        // 名前とHPを設定
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");

        // お化けキノコAを生み出す
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        // お化けキノコBを生み出す
        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        // 各種指示を出す
        h.sit(5);
        h.sleep();
        h.sit(25);
        h.run();
    }
}
