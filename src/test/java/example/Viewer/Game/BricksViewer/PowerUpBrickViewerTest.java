package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.model.Position;
import example.model.game.elements.brick.PowerUpBrick;
import net.jqwik.api.ForAll;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class PowerUpBrickViewerTest {

    private Position position;

    private GUI gui;

    private PowerUpBrickViewer powerUpBrickViewer;

    @BeforeEach
    void setUp(){
        gui = mock(GUI.class);
        position = new Position(10,10);
        powerUpBrickViewer = new PowerUpBrickViewer();
    }
    
    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        powerUpBrickViewer.draw(new PowerUpBrick(1 ,1 ), gui);
    }
}