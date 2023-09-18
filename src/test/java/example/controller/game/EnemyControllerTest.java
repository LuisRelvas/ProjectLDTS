package example.controller.game;

import com.googlecode.lanterna.screen.Screen;
import example.GUI.GUI;
import example.Game;
import example.model.game.map.Map;
import example.model.game.elements.mario.Mario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

class EnemyControllerTest {
    @Mock
    EnemyController enemyController;

    private Mario mario;
    private Map mapa;

    private GUI gui;

    private Screen screen;

    private AutoCloseable mockitoCloseable;

    @BeforeEach


    void setUp() {
        mockitoCloseable = openMocks(this);
        MockitoAnnotations.openMocks(this);
        mapa = new Map(10, 10);
        gui = mock(GUI.class);
        mario = new Mario(5, 5);
        mapa.setHero(mario);
        mapa.setCoins(Arrays.asList());
        mapa.setWalls(Arrays.asList());
        mapa.setEnemies(Arrays.asList());
        enemyController = new EnemyController(mapa);

    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testStep() throws IOException, URISyntaxException, FontFormatException {
        final Game game = new Game();
        enemyController.step(game,GUI.ACTION.UP,1L);

    }
}
