package example.Viewer.Game;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.model.Position;
import example.model.game.elements.PowerUp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class PowerUpViewerTest {
    PowerUpViewer powerUpViewer;
    private Position position;

    private GUI gui;

    @BeforeEach
    void setUp(){
        gui = mock(GUI.class);
        position = new Position(10,10);
        powerUpViewer = new PowerUpViewer();

    }
    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        powerUpViewer.draw(new PowerUp(5, 5), gui);
    }
}
