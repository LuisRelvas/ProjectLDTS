import example.Game;
import example.controller.game.MapController;
import example.model.game.map.Map;
import example.model.game.elements.mario.Mario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class MapaControllerTest {
    private MapController controller;
    private Map map;
    private Mario mario;
    private Game game;

    @BeforeEach
    void setUp() {
        map = new Map(10,10);
        map.setWalls(Arrays.asList());
        map.setEnemies(Arrays.asList());
        controller = new MapController(map);
        game = Mockito.mock(Game.class);
    }

    @Test
    void testMap() {
        Map mapa = new Map(10,10);

    }

}
