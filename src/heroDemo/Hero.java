package src.heroDemo;

import java.util.Scanner;

public class Hero implements Weapon {
    private String name;
    private int flood;
    private int grade;

    //    private boolean haveWeapon;
//    private int weaponType;
    public Hero() {

        System.out.println("报上名来：");
        Scanner in = new Scanner(System.in);
        this.name = in.next();
        this.flood = 100;
        this.grade = 1;
        System.out.println("英雄名：" + this.name);
        System.out.println("生命值：" + this.flood);
        System.out.println("等级：" + this.grade);
    }

    public Hero(int type) {
        System.out.println("报上名来：");
        Scanner in = new Scanner(System.in);
        this.name = in.next();
        if (type == 1) {
            this.flood = 100;
        } else {
            this.flood = 1000;
        }
        this.grade = 1;
        System.out.println("英雄名：" + this.name);
        System.out.println("生命值：" + this.flood);
        System.out.println("等级：" + this.grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlood() {
        return flood;
    }

    public void setFlood(int flood) {
        this.flood = flood;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void battle(Hero hero) {
        hero.setFlood(Math.max(0, hero.getFlood() - 100));
        System.out.println(this.name+"攻击了"+hero.name);
        System.out.println(hero.name+"剩余生命值"+hero.flood);
        System.out.println("----------------------------------------");
    }

    public void battle(Hero hero, int battleType) {
        hero.setFlood(Math.max(0, hero.getFlood() - 100 * battleType));
    }

    @Override
    public void weaponBattle(Hero hero) {
        System.out.println("请为"+this.name+"选择武器：");
        System.out.println("1：金箍棒");
        System.out.println("2：骑士盾");
        Scanner in = new Scanner(System.in);
        int weaponType = in.nextInt();
        if (weaponType == 1) {
            hero.setFlood(Math.max(hero.getFlood() - 300, 0));
            System.out.println(this.name+"获得了金箍棒");
            System.out.println(this.name+"攻击了"+hero.name);
            System.out.println(hero.name+"剩余生命值"+hero.flood);
        } else {
            this.setFlood(this.getFlood() + 300);
            System.out.println(this.name+"获得了骑士盾");
            System.out.println(this.name+"攻击了"+hero.name);
            hero.setFlood(Math.max(hero.getFlood() - 100, 0));
            System.out.println(hero.name+"剩余生命值"+hero.flood);
        }
        System.out.println("----------------------------------------");


    }
}
