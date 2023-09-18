package example.controller.game;

import example.Game;
import example.model.game.map.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.openMocks;

class MarioControllerTest {
    @Mock
    private MarioController marioController;
    private Map mockMap;
    private AutoCloseable mockitoCloseable;

    @BeforeEach
    void setUp() {
        mockitoCloseable = openMocks(this);
        marioController = new MarioController(mockMap);
    }
    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testStep() throws IOException, URISyntaxException, FontFormatException {
        final Game game = new Game();

    }

    @Test
    void testGravity() {
        marioController.gravity(0L);
    }

    @Test
    void testMoveHeroLeft() {
        marioController.moveHeroLeft();
    }

    @Test
    void testMoveHeroRight() {
        marioController.moveHeroRight();
    }

    @Test
    void testMoveHeroJump() {
        marioController.moveHeroJump(0L);
    }

    @Test
    void testMoveHeroDown() {
        marioController.moveHeroDown();
    }
}