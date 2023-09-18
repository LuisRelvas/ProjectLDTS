package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.model.Position;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class WallViewerTest {
    private Position position;

    private GUI gui;
    private WallViewer wallViewer ;

    @BeforeEach
    void setUp(){
        gui = mock(GUI.class);
        wallViewer = new WallViewer();
        position = new Position(10,10);}

    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        wallViewer.draw(new NormalBrick(0, 0), gui);
    }
}
