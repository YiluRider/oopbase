package src.heroDemo;

public class Main {
    public static void main(String[] args) {
        Hero heroA = new Hero(2);
        Hero heroB = new Hero(2);
        System.out.println("----------------------------------------");
        heroA.battle(heroB);
        heroB.battle(heroA);
        heroA.weaponBattle(heroB);
        heroB.weaponBattle(heroA);
    }
}
