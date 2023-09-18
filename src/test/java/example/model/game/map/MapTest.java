package example.model.game.map;

import example.GUI.GUI;
import example.model.Position;
import example.model.game.elements.*;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class MapTest {
    @Mock
    Mario mario;
    EndFlag endFlag = new EndFlag(10,10);

    List<Enemy> Enemies;

    List<NormalBrick> normalBricks;

    List<PowerUpBrick> powerUpBricks;

    List<CoinBrick> coinBricks;
    List<Coin> coins;
    List<PowerUp> powerUps;
    Camera camera;

    BreakableBrick breakableBrick;
    Map map;
    private GUI gui;

    @BeforeEach
    void setUp() {
        gui = mock(GUI.class);
        mario =mock(Mario.class);
        EndFlag endFlag = new EndFlag(10,10);
        Camera camera = new Camera(10,10);



        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testIsEmpty() {
        camera = new Camera(10,10);
        when(mario.getPosition()).thenReturn(new Position(10, 10));
        when(camera.getPosition()).thenReturn(new Position(10, 10));
        boolean result = map.isEmpty(new Position(10, 10));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsBreakableBrick() {
        breakableBrick = new BreakableBrick(10,10);
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isBreakableBrick(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsPowerBrick() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isPowerBrick(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsCoinBrick() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isCoinBrick(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsMonster() {
        when(mario.isExtraLife()).thenReturn(true);
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isMonster(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsCoin() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        Boolean result = map.isCoin(new Position(0, 0));
        Assertions.assertEquals(Boolean.TRUE, result);
    }

    @Test
    void testIsMonsterHit() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isMonsterHit(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsPowerUp() {
        when(mario.isExtraLife()).thenReturn(true);
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        Boolean result = map.isPowerUp(new Position(0, 0));
        Assertions.assertEquals(Boolean.TRUE, result);
    }

    @Test
    void testDeadFall() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.deadFall();
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsEndFlag() {
        when(mario.getPosition()).thenReturn(new Position(0, 0));
        when(endFlag.getPosition()).thenReturn(new Position(0, 0));
        when(camera.getPosition()).thenReturn(new Position(0, 0));

        boolean result = map.isEndFlag(new Position(0, 0));
        Assertions.assertEquals(true, result);
    }

    @Test
    void testEraseCoin() {
        map.EraseCoin(new Coin(0, 0));
    }

    @Test
    void testEraseEnemy() {
        map.EraseEnemy(new Enemy(0, 0));
    }
}
