package com.sample.chapter11;

import com.sample.chapter8.Matango;

// 抽象メソッドを持つのでクラスも抽象化する
public abstract class Character {
    String name;
    int hp;

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    // 戦う
    // 詳細未定のメソッドとして宣言する　⇒　abstract
    public abstract void attack(Matango m);
}
