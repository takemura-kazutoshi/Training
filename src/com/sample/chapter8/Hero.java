package com.sample.chapter8;

public class Hero {
    // Property
    String name;
    int hp;

    // method
    public void attack() {}
    public void sleep() {
        this.hp = 100;
        // thisは「自分自身のインスタンス」を表す
        // ここでは「Hero.class」から生成される（はずの）インスタンスのHPを100にセットするメソッド
        // インスタンスを表すだけで、設計図となるクラスのHPを定義するものではない！！
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" +this.hp + "でした");
    }
}
