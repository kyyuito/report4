package jp.ac.uryukyu.ie.e225760;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnemyTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void attackTest() {
        int defaultHeroHp = 100;
        Hero demoHero = new Hero("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<10; count++){
            demoHero.attack(slime); // over kill
        }
        slime.attack(demoHero);
        assertEquals(defaultHeroHp, demoHero.getHitPoint());
    }
}
    