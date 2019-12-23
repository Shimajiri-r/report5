package jp.ac.uryukyu.ie.e185403;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5,false);
        Enemy enemy = new Enemy("テストスライム", 6, 3,true);
        for(int i=0; i<5; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitpoint());
    }
}