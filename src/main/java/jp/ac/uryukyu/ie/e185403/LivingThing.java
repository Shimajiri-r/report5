package jp.ac.uryukyu.ie.e185403;

/**
 * LivingThingクラス。
 *  String name;//名前
 *  int hitPoint;//体力
 *  int attack;//攻撃力
 *  boolean dead;//生死の状態。true=死亡
 * Created by e185403 on 2019/12/24
 */

public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、体力、攻撃力、生死状態を設定する。
     * @param name 名前
     * @param maximumHP 体力
     * @param attack 攻撃力
     * @param dead 生死状態
     */
    public LivingThing(String name, int maximumHP, int attack,boolean dead){
        setName(name);
        setHitPoint(maximumHP);
        setAttack(attack);
        setIsDead(dead);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", getName(), getHitpoint(), getAttack());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHitPoint(int maximumHP){
        this.hitPoint = maximumHP;
    }

    public int getHitpoint(){
        return hitPoint;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getAttack(){
        return attack;
    }

    public void setIsDead(boolean dead){
        this.dead = dead;
    }

    public boolean getIsDead(){
        return dead;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (getIsDead() == false) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        int hitpoint = getHitpoint();
        hitpoint -= damage;
        setHitPoint(hitpoint);
        if( hitpoint <= 0 ) {
            setIsDead(true);
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}