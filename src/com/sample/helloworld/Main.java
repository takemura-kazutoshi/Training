package com.sample.helloworld;

import com.sample.helloworld.comment.Zenhan;
import java.util.concurrent.LinkedBlockingDeque;


public class Main {
// Hello World
/*    public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/

// 練習1-2
/*    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅"+a+"横幅"+b+"の長方形の面積は、"+c);

    }*/

// 練習1-3
/*    public static void main(String[] args) {
        boolean isError = true;
        char drive = '駆'; // char型はシングルクォーテーション(')、string型はダブルクォーテーション(")
        double pi = 3.14;
        long PI = 314159265358979L;
        String attack = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
    }*/

// 練習2-1
/*    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String ans = "x+yは" + (x + y);
        System.out.println(ans);
    }*/

// 練習2-3
/*    public static void main(String[] args) {

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

    }*/

// 練習3-3
/*    public static void main(String[] args) {
        int isHungry = 1;
        String food = "カレーライス";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }*/

// 練習3-4
/*    public static void main(String[] args) {
        boolean tenki = false;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
        }
    }*/

// 練習3-5
/*    public static void main(String[] args) {
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }
    }*/

// 練習3-6
/*    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int index = 0; index < 5; index++) {
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }*/

// 練習4-2
/*    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};
        for (int index=0; index<moneyList.length; index++) {
            System.out.println(moneyList[index]);
        }
        for (int value : moneyList) {
            System.out.println(value);
        }
    }*/

// 練習4-4
/*    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
*//*        for (int index=0; index<numbers.length; index++) {
            if (input == numbers[index]) {
                System.out.println("アタリ！");
            }
        }*//*
        for (int n : numbers) {
            if (input == n) {
                System.out.println("アタリ！");
            }
        }
    }*/

// 練習5-1
/*    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "ほげほげ";
        int age = 20;
        double height = 170.5;
        char junishi = '子';
        System.out.println("私の名前は" + name + "です。\r\n" + "年齢は" + age + "歳、身長は" + height + "cmです。\r\n干支は" + junishi + "です。");
    }*/

// 練習5-2
/*    public static void main(String[] args) {
        String title = "打合せについて";
        String address = "aaa@bbb.com";
        String text = "明日の打ち合わせは10時からお願いします。";
        email(title,address,text);
        email(address,text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました\r\n件名：" + title + "\r\n本文：" + text);
    }*/

// 練習5-3
/*    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました\r\n件名：無題\r\n本文：" + text);
    }*/

// 練習5-4
/*    public static void main(String[] args) {
        double areaTri = triangleArea(10.0, 5.0);
        double areaCirc = circleArea(5.0);
        System.out.println(areaTri);
        System.out.println(areaCirc);
    }

    public static double triangleArea(double bottom, double height) {
//        double area = bottom * height / 2;
        return bottom * height / 2;
    }

    public static double circleArea(double radius) {
//        double area = Math.pow(radius, 2) * 3.14;
        return Math.pow(radius, 2) * 3.14;
    }*/

// 練習6-1
    public static void main(String[] args) {
        Zenhan.doWarusa();
        Zenhan.doTogame();
        com.sample.helloworld.comment.Kouhan.callDeae();
        com.sample.helloworld.comment.Kouhan.showMondokoro();
    }
}
