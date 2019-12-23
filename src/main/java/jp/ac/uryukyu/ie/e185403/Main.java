package jp.ac.uryukyu.ie.e185403;

/**
 * Created by tnal on 2016/11/13.
 */
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5,false);
        Enemy enemy = new Enemy("スライム", 6, 3,false);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.getIsDead() == false && enemy.getIsDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}