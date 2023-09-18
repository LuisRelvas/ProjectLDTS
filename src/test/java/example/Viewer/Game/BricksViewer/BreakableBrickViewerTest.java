package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.model.Position;
import example.model.game.elements.brick.BreakableBrick;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class BreakableBrickViewerTest {

    BreakableBrickViewer breakableBrick;

    private GUI gui;

    private Position position;

    @BeforeEach
    void setUp(){
        gui = mock(GUI.class);
        position = new Position(10,10);
        breakableBrick = new BreakableBrickViewer();
    }
    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        breakableBrick.draw(new BreakableBrick(0, 0), gui);
    }
}

