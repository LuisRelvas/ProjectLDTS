package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.model.Position;
import example.model.game.elements.Coin;
import example.model.game.elements.brick.CoinBrick;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class CoinBrickViewerTest {

    private Position position;

    private CoinBrickViewer coinBrickViewer;
    private GUI gui;
    @BeforeEach
    void setUp(){
        gui = mock(GUI.class);
        position = new Position(10,10);
        coinBrickViewer = new CoinBrickViewer();

    }
    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        coinBrickViewer.draw(new CoinBrick(0, 0), gui);
    }
}
