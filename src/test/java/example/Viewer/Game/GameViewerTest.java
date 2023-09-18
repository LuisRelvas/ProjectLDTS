package example.Viewer.Game;

import example.GUI.GUI;
import example.model.game.map.Map;
import example.model.game.elements.Coin;
import example.model.game.elements.EndFlag;
import example.model.game.elements.Enemy;
import example.model.game.elements.PowerUp;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class GameViewerTest {

    @Mock
    private Map mockMap;

    private GameViewer gameViewerUnderTest;

    private AutoCloseable mockitoCloseable;

    private GUI gui;

    @BeforeEach
    void setUp() {
        gui = mock(GUI.class);
        mockitoCloseable = openMocks(this);
        gameViewerUnderTest = new GameViewer(mockMap);
    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testDrawElements1() {

        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(1, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(1, 1));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(1, 1)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(1, 1)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(1, 1));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(1, 1)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(1, 1)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));

        gameViewerUnderTest.drawElements(gui);


    }

    @Test
    void testDrawElements1_MapGetWallsReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(Collections.emptyList());
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));

        gameViewerUnderTest.drawElements(gui);

    }

    @Test
    void testDrawElements1_MapGetCoinsReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(Collections.emptyList());
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));

        gameViewerUnderTest.drawElements(gui);

    }

    @Test
    void testDrawElements1_MapGetEnemiesReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(Collections.emptyList());
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));

        gameViewerUnderTest.drawElements(gui);


    }

    @Test
    void testDrawElements1_MapGetPowerUpsReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(Collections.emptyList());
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));


        gameViewerUnderTest.drawElements(gui);


    }

    @Test
    void testDrawElements1_MapGetBreakableBricksReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(Collections.emptyList());
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));


        gameViewerUnderTest.drawElements(gui);


    }

    @Test
    void testDrawElements1_MapGetCoinBricksReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(Collections.emptyList());
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(0, 0)));

        gameViewerUnderTest.drawElements(gui);

    }

    @Test
    void testDrawElements1_MapGetPowerUpBricksReturnsNoItems() {


        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(0, 0)));
        when(mockMap.getHero()).thenReturn(new Mario(0, 0));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(0, 0)));
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(0, 0)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(0, 0));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(0, 0)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(0, 0)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(0, 0)));
        when(mockMap.getPowerUpBricks()).thenReturn(Collections.emptyList());

        gameViewerUnderTest.drawElements(gui);

    }
}
