package jp.ac.uryukyu.ie.e225760;

public class Hero extends LivingThing{
    public Hero(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは倒れた。\n", name);
        }
    }
}
  