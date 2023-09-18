package example.controller.game;

import example.GUI.GUI;
import example.Game;
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

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class CameraControllerTest {

    @Mock
    private Map mockMap;

    private CameraController cameraControllerUnderTest;

    private AutoCloseable mockitoCloseable;

    @BeforeEach
    void setUp() {
        mockitoCloseable = openMocks(this);
        cameraControllerUnderTest = new CameraController(mockMap);
    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testStep() throws Exception {
        final Game game = new Game();
        when(mockMap.getEnemies()).thenReturn(List.of(new Enemy(1, 2)));
        when(mockMap.getHero()).thenReturn(new Mario(2, 3));
        when(mockMap.getWalls()).thenReturn(List.of(new NormalBrick(3, 4)));
        when(mockMap.getBreakableBricks()).thenReturn(List.of(new BreakableBrick(5, 6)));
        when(mockMap.getPowerUpBricks()).thenReturn(List.of(new PowerUpBrick(7, 8)));
        when(mockMap.getCoinBricks()).thenReturn(List.of(new CoinBrick(9, 10)));
        when(mockMap.getCoins()).thenReturn(List.of(new Coin(11, 12)));
        when(mockMap.getPowerUps()).thenReturn(List.of(new PowerUp(13, 14)));
        when(mockMap.getEndFlag()).thenReturn(new EndFlag(15, 16));

        cameraControllerUnderTest.step(game, GUI.ACTION.UP, 1L);

    }
    }


