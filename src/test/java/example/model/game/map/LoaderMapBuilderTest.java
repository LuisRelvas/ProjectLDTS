package example.model.game.map;

import example.model.game.elements.*;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoaderMapBuilderTest {

    private LoaderMapBuilder loaderMapBuilderUnderTest;

    @BeforeEach
    void setUp() throws Exception {
        loaderMapBuilderUnderTest = new LoaderMapBuilder(1);
    }

    @Test
    void testGetWidth() {
        assertEquals(239, loaderMapBuilderUnderTest.getWidth());
    }

    @Test
    void testGetHeight() {

        final int result = loaderMapBuilderUnderTest.getHeight();
        assertEquals(20, result);
    }

    @Test
    void testCreateWalls() {
        final List<NormalBrick> result = loaderMapBuilderUnderTest.createWalls();

    }

    @Test
    void testCreateBreakableBricks() {
        final List<BreakableBrick> result = loaderMapBuilderUnderTest.createBreakableBricks();

    }

    @Test
    void testCreatePowerUpBricks() {

        final List<PowerUpBrick> result = loaderMapBuilderUnderTest.createPowerUpBricks();

    }

    @Test
    void testCreateCoinBricks() {
        final List<CoinBrick> result = loaderMapBuilderUnderTest.createCoinBricks();

    }

    @Test
    void testCreateCoins() {
        final List<Coin> result = loaderMapBuilderUnderTest.createCoins();
    }

    @Test
    void testCreatePowerUps() {
        final List<PowerUp> result = loaderMapBuilderUnderTest.createPowerUps();
    }

    @Test
    void testCreateEnemies() {

        final List<Enemy> result = loaderMapBuilderUnderTest.createEnemies();

    }

    @Test
    void testCreateHero() {
        final Mario result = loaderMapBuilderUnderTest.createHero();

    }

    @Test
    void testCreateEndFLag() {

        final EndFlag result = loaderMapBuilderUnderTest.createEndFLag();

    }

    @Test
    void testCreateCamera() {

        final Camera result = loaderMapBuilderUnderTest.createCamera();

    }
}
